package com.project.pub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import com.project.pub.model.User;

@Controller
public class UserController {
    
    @GetMapping("/user")
    public String user(Model model){
        List <User> user = new ArrayList<>();
        user.add(new User(1, "Nur", "admin"));
        user.add(new User(2, "Hilwa", "user"));
        user.add(new User(3, "Cupit", "admin"));
        user.add(new User(4, "Riri", "tamu"));
        model.addAttribute("user", user);
        return "user";
        
    }
}
