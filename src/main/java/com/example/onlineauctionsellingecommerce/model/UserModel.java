package com.example.onlineauctionsellingecommerce.model;
import com.example.onlineauctionsellingecommerce.entity.Role;
import com.example.onlineauctionsellingecommerce.entity.User;
import lombok.Data;

@Data
public class UserModel {
    private Long id;
    private String name;
    private String password;
    private Long mobileNumber;
    private String email;

    public User disassemble(){
        User user=new User();
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);
        user.setMobileNumber(mobileNumber);
        return user;
    }
    public UserModel assemble(User user){
        UserModel userModel=new UserModel();
        userModel.setId(user.getId());
        userModel.setName(user.getName());
        userModel.setPassword(user.getPassword());
        userModel.setEmail(user.getEmail());
        userModel.setMobileNumber(user.getMobileNumber());
        return userModel;
    }
}
