package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServices uv;

    @PostMapping("/register")
    public String register(@RequestBody UserDetails user) {
        return uv.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestParam String uname,
                        @RequestParam String password) {
        return uv.login(uname, password);
    }
}

