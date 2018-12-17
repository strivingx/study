package impl;

import com.yyy.dao.UserDao;
import com.yyy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/7/12 0012.
 * 用户业务层
 * 注意实际开发中肯定就是使用@Service注解了，这里为了学习@ImportSource注解方便-
 * 就像注释掉，采用beans.xml配置的方式将UserService加入到Spring容器中去
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return ("service test");
    }

    @Autowired
    @Qualifier("userDao") // 指定注入
    private UserDao userDao;

    @Transactional
    // @Transactional(rollbackFor={Exception.class, RuntimeException.class},propagation = Propagation.REQUIRES_NEW)
    @Override
    public String testWithTransaction() {
        userDao.insert("有事务不能插入数据库");
        int a = 1 / 0;
        return "success";
    }

    @Override
    public String testWithoutTransaction() {
        userDao.insert("没有事务能插入数据库");
        int a = 1 / 0;
        return "success";
    }

}
