package com.example.auto_secretary.controller;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.entity.Position;
import com.example.auto_secretary.repository.DepartamentRepository;
import com.example.auto_secretary.repository.PositionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class PositionController {
    private final PositionRepository positionRepository;

    public PositionController (PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @PostMapping("positions/create")
    public ResponseEntity addNewPosition(@RequestBody Position position){
        try {
            positionRepository.save(position);
            return ResponseEntity.ok().body("Должность успешно создана");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла неизвестная ошибка");
        }
    }

    @GetMapping("positions/get")
    public List<Position> get(){
        return positionRepository.findAll();
    }

    @GetMapping("positions/get/{id}")
    public Optional<Position> get(@PathVariable Long id){
        return positionRepository.findById(id);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onIllegalArgumentExeption(){
        return "Wrong id";
    }
}
