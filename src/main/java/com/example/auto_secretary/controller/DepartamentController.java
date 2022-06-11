package com.example.auto_secretary.controller;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.repository.DepartamentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class DepartamentController {
    private final DepartamentRepository departamentRepository;

    public DepartamentController(DepartamentRepository departamentRepository) {
        this.departamentRepository = departamentRepository;
    }

    @PostMapping("departaments/create")
    public ResponseEntity addNewDepartament(@RequestBody Departament departament){
        try {
            departamentRepository.save(departament);
            return ResponseEntity.ok().body("Департамент успешно создан");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла неизвестная ошибка");
        }
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
