package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository rt;

    // Register
    public String register(UserDetails user) {

        if (rt.findByEmail(user.getEmail()) != null) {
            return "Email already exists";
        }

        rt.save(user);
        return "ok";
    }

    // Login
    public String login(String uname, String password) {
        UserDetails user = rt.login(uname, password);

        if (user != null) {
            return "success";
        } else {
            return "invalid";
        }
    }
}
