package ru.dimafeng.springresttest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.dimafeng.springresttest.model.User;
import ru.dimafeng.springresttest.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    @ResponseBody
    public List<User> user() {
        return userService.getUsers();
    }

}
