//package com.example.onlineauctionsellingecommerce.security;
//
//import com.example.onlineauctionsellingecommerce.entity.UserRole;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import com.example.onlineauctionsellingecommerce.model.UserModel;
//
//import java.util.stream.Collectors;
//
//public class AppUserDetails extends User {
//    private UserModel userModel;
//    public AppUserDetails(com.example.onlineauctionsellingecommerce.entity.User user){
//        super(user.getName(), user.getPassword(),true,true,true,true,
//                user.getUserRoleList()
//                        .stream()
//                        .map((UserRole userRole)->new SimpleGrantedAuthority(userRole.getRole().getRoleName()))
//                        .collect(Collectors.toList()));
//        this.userModel=new UserModel();
//    }
//    public UserModel getUserModel() {
//        return userModel;
//    }
//
//    public void setUserModel(UserModel userModel) {
//        this.userModel = userModel;
//    }
//}
