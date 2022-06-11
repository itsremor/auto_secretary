package com.example.auto_secretary.service;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.exceptions.DepartamentAlreadyExistsException;
import com.example.auto_secretary.repository.DepartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

@Service
public class DepartamentService {
    @Autowired
    private DepartamentRepository departamentRepository;

//    public Departament createDepartement(Departament departament) throws DepartamentAlreadyExistsException{
//        if (departamentRepository.findByName(departament.getName()) != null){
//            throw  new DepartamentAlreadyExistsException("Такой департамент уже существует");
//        }
//        return departamentRepository.save(departament);
//    }
}
