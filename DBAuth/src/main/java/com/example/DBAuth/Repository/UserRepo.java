package com.example.DBAuth.Repository;
import com.example.DBAuth.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepo extends JpaRepository<User, Integer> {
    UserDetails findByUsername(String username);
}
