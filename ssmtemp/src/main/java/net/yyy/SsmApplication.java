package net.yyy;

import com.yyy.service.TestService;
import com.yyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableTransactionManagement // 开启注解事务管理，等同于xml配置文件中的 <tx:annotation-driven />
@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"}) // 导入外部xml配置
@Controller // 表示为controller类 @RestController == @Controller + @ResponseBody
public class SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmApplication.class, args);
	}

	@Bean // TODO 作用？
	public Object testBean(PlatformTransactionManager platformTransactionManager){
		System.out.println(">>>>>>>>>>" + platformTransactionManager.getClass().getName()); // 测试开启的事务类
		return new Object();
	}

	@Autowired // 根据类型注入
	// @Resource // 根据名称注入
	private TestService testService;
	@Autowired
	private UserService userService;

	@RequestMapping("/xml")
	@ResponseBody // 表示返回的结果直接放入body中
	public String testXMLConfig(){
		return testService.test();
	}

	@RequestMapping("/xml1")
	@ResponseBody // 表示返回的结果直接放入body中
	public String testXMLConfig1(){
		return testService.test();
	}

	@RequestMapping("/transaction")
	@ResponseBody // 表示返回的结果直接放入body中
	public String testTransaction(Boolean isOpenTransaction){
		if(isOpenTransaction) {
			testService.testWithTransaction();
		} else {
			testService.testWithoutTransaction();
		}
		return "transaction";
	}

	@GetMapping("/index")
	public String index(){
		return "index";
	}

}
