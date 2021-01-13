package com.example.spring.controller;

import com.example.spring.entity.Login;
import com.example.spring.service.LoginService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.sql.SQLException;

@RestController
@RequestMapping("/Login")
public class LoginController {

    @Inject
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.POST)
    public void createLogin(@RequestBody Login login) throws SQLException, ClassNotFoundException{
        System.out.println(login.getName());
        System.out.println(login.getPassword());
    }
}


