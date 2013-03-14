package ru.dimafeng.springresttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.dimafeng.springresttest.User;

@Controller
public class UserController {

    @RequestMapping
    @ResponseBody
    public User user() {
        User user = new User();
        user.setPassword("test");
        user.setUsername("test");
        return user;
    }

}
