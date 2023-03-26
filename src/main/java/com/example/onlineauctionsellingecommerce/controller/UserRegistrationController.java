package com.example.onlineauctionsellingecommerce.controller;
import com.example.onlineauctionsellingecommerce.model.UserModel;
import com.example.onlineauctionsellingecommerce.service.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserRegistrationController {
    @Autowired
    private UserRegistration userRegistration;
    @PostMapping("/registration")
    public UserModel userRegistration(@RequestBody UserModel userModel){
        return userRegistration.save(userModel);
    }
}
