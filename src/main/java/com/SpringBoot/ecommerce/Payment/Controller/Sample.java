package com.SpringBoot.ecommerce.Payment.Controller;

import com.SpringBoot.ecommerce.Product.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Sample {
    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome to springboot";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("2");
        user.setName("Ritvik");
        user.setEmailId("xyz@gmail.com");
        return user;
    }

    @GetMapping("/user/{id}")
    public String pathUser(@PathVariable String id){
        return "User Id is "+id;
    }
}
