package controller;

import com.yyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 表示为controller类
@RequestMapping("/users")
public class UserController extends BaseController{

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
		super.setBaseService(userService);
	}

}
