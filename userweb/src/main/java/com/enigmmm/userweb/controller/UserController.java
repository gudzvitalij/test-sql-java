package com.enigmmm.userweb.controller;

import com.enigmmm.userweb.model.User;
import com.enigmmm.userweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/user-create")
    public String createUserShape(User user){
        return "user-create";
    }

    @GetMapping("user-delete/{id}")
    public String deleteUser(@PathVariable("id") Integer userId){
        userService.deleteById(userId);
        return "redirect:/users";
    }

    @GetMapping("/user-update/{id}")
    public String updateUserShape(@PathVariable("id") Integer userId, Model model){
        User user = userService.findById(userId);
        model.addAttribute("user", user);
        return "user-update";
    }

    @PostMapping("/user-update")
    public String updateUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }

    @PostMapping("/user-create")
    public String createUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
}
