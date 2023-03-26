package com.example.onlineauctionsellingecommerce.service;
import com.example.onlineauctionsellingecommerce.entity.User;
import com.example.onlineauctionsellingecommerce.model.UserModel;
import com.example.onlineauctionsellingecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
@Service
public class UserRegistration {
    @Autowired
    private UserRepository userRepository;

    public UserModel save(UserModel userModel) {
        User user = null;
        if (!ObjectUtils.isEmpty(userModel)) {
            user = findExistMobileNumber(userModel);
            if (ObjectUtils.isEmpty(user)) {
                user = userModel.disassemble();
            } else {
                user.setMobileNumber(userModel.getMobileNumber());
            }
        }
        return userModel.assemble(userRepository.save(user));
    }
    private User findExistMobileNumber(UserModel userModel) {
        User user=null;
        if(!ObjectUtils.isEmpty(userModel.getMobileNumber())) {
            user = userRepository.findUserByMobileNumber(userModel.getMobileNumber());
        }
        return user;
    }
}

