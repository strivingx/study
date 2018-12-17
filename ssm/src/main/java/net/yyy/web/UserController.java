package net.yyy.web;

import net.yyy.entity.User;
import net.yyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    @ResponseBody
    public User getUser(Integer id) {
        return userService.getById(id);
    }

}
