package net.yyy.service;

import net.yyy.dao.UserDao;
import net.yyy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int userId) {
        System.out.println(userDao.selectByPrimaryKey(userId));
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public boolean add(User record) {
        return userDao.insertSelective(record) > 0;
    }

}