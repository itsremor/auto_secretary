package com.example.auto_secretary.repository;
import com.example.auto_secretary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
