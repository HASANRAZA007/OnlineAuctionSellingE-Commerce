package com.example.onlineauctionsellingecommerce.repository;
import com.example.onlineauctionsellingecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

     User findUserByMobileNumber(Long monileNumber);
}
