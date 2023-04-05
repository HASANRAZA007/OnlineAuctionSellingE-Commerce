package com.example.onlineauctionsellingecommerce.controller;
import com.example.onlineauctionsellingecommerce.model.LoginModel;
import com.example.onlineauctionsellingecommerce.model.UserModel;
import com.example.onlineauctionsellingecommerce.service.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserRegistrationController {
    private final UserRegistration userRegistration;
    @Autowired
    public UserRegistrationController(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }

    @PostMapping("/registration")
    public String   userRegister(@RequestBody UserModel userModel){
    return userRegistration.saveUser(userModel);
    }
    @GetMapping("/login")
    public String login(@RequestBody LoginModel loginModel){
        return userRegistration.userLogin(loginModel);
    }
}