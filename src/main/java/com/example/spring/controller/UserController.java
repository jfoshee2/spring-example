package com.example.spring.controller;

import com.example.spring.entity.User;
import com.example.spring.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Inject
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUser() throws SQLException,ClassNotFoundException{
        return userService.getUser();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody User user) throws SQLException, ClassNotFoundException{
        userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user) throws SQLException, ClassNotFoundException{
        userService.updateUser(user);
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("user_id") int userId) throws SQLException, ClassNotFoundException{
        userService.deleteUser(userId);
    }
}
