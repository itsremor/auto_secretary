package com.example.auto_secretary.controller;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.entity.Position;
import com.example.auto_secretary.entity.User;
import com.example.auto_secretary.repository.DepartamentRepository;
import com.example.auto_secretary.repository.PositionRepository;
import com.example.auto_secretary.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("users/create")
    public ResponseEntity addNewPosition(@RequestBody User user){
        try {
            userRepository.save(user);
            return ResponseEntity.ok().body("Пользователь успешно создан");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла неизвестная ошибка");
        }
    }

    @GetMapping("users/get")
    public List<User> get(){
        return userRepository.findAll();
    }

    @GetMapping("users/get/{id}")
    public Optional<User> get(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onIllegalArgumentExeption(){
        return "Wrong id";
    }
}
