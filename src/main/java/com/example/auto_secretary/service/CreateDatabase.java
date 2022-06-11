package com.example.auto_secretary.service;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.repository.DepartamentRepository;

public class CreateDatabase {
    public static void createDepartaments(DepartamentRepository departamentRepository) {
        Departament departament = new Departament("Компания");
        departamentRepository.save(departament);

        departament = new Departament("Департамент разработки ПО");
        departamentRepository.save(departament);

        departament = new Departament("Департамент продаж");
        departamentRepository.save(departament);

        departament = new Departament("Административный отдел");
        departamentRepository.save(departament);

        departament = new Departament("Департамент HR");
        departamentRepository.save(departament);

        departament = new Departament("Департамент консалтинга");
        departamentRepository.save(departament);
        }

        public static void createUsers(){

        }
    }
