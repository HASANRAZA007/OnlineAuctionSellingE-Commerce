package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.UserRole;
import com.example.onlineauctionsellingecommerce.model.LoginModel;
import com.example.onlineauctionsellingecommerce.model.UserModel;

public interface UserRegister {
      String saveUser(UserModel userModel);
      String deleteUser(UserRole userRole);
      String userLogin(LoginModel loginModel);
}
