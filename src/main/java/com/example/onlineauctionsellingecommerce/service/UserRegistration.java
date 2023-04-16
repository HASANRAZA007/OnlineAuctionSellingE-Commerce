package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.Role;
import com.example.onlineauctionsellingecommerce.entity.User;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import com.example.onlineauctionsellingecommerce.model.LoginModel;
import com.example.onlineauctionsellingecommerce.model.UserModel;
import com.example.onlineauctionsellingecommerce.repository.RoleRepository;
import com.example.onlineauctionsellingecommerce.repository.UserRepository;
import com.example.onlineauctionsellingecommerce.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistration implements UserRegister {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserRegistration(UserRepository userRepository, RoleRepository roleRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public String saveUser(UserModel userModel) {
        String result, roleName;
        Long userModelMobileNumber = userModel.getMobileNumber();
        User userExist = userRepository.findUserByMobileNumber(userModelMobileNumber);
        if (userExist != null) {
            result = "User already exist with same Mobile Number!";

        } else {
            User user;
            new User();
            roleName = userModel.getRole();
            Role role = roleRepository.findByRoleName(roleName);
            role.setRoleName(roleName);
            roleRepository.save(role);
            user = userModel.disassemble();
            userRepository.save(user);
            UserRole userRole = new UserRole();
            userRole.setUser(user);
            userRole.setRole(role);
            userRoleRepository.save(userRole);
            result = "User saved successfully";
        }

        return result;
    }

    @Override
    public String deleteUser(UserRole userRole) {
        return "User Successfully Deleted.";
    }

    @Override
    public String userLogin(LoginModel loginModel) {
        String email = loginModel.getEmail();
        String password = loginModel.getPassword();
        User confirmDetail = userRepository.findByEmailAndPassword(email, password);
        if (confirmDetail != null) {
            return "You are Welcome!";

        } else {
            return "User not Exist, Register Your Account.";
        }
    }
}

