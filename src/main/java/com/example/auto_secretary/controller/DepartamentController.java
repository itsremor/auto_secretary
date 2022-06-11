package com.example.auto_secretary.controller;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.repository.DepartamentRepository;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class DepartamentController {
    private final DepartamentRepository departamentRepository;

    public DepartamentController(DepartamentRepository departamentRepository) {
        this.departamentRepository = departamentRepository;
    }

    @GetMapping("departaments/get")
    public List<Departament> get(){
        return departamentRepository.findAll();
    }

    @GetMapping("departaments/get/{id}")
    public Optional<Departament> get(@PathVariable Long id){
        return departamentRepository.findById(id);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onIllegalArgumentExeption(){
        return "Wrong id";
    }
}
