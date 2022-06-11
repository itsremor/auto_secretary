package com.example.auto_secretary.service;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.entity.Position;
import com.example.auto_secretary.entity.User;
import com.example.auto_secretary.repository.DepartamentRepository;
import com.example.auto_secretary.repository.PositionRepository;
import com.example.auto_secretary.repository.UserRepository;

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

        public static void createPositions(PositionRepository positionRepository){
            Position position = new Position("Директор по мероприятиям", true);
            positionRepository.save(position);

            position = new Position("Java разработчик", false);
            positionRepository.save(position);

            position = new Position("JS разработчик", false);
            positionRepository.save(position);

            position = new Position("QA инженер", false);
            positionRepository.save(position);

            position = new Position("HR менеджер", false);
            positionRepository.save(position);

            position = new Position("Системный администратор", true);
            positionRepository.save(position);

            position = new Position("Руководитель проекта", true);
            positionRepository.save(position);
        }

        public static void createUsers(UserRepository userRepository, DepartamentRepository departamentRepository, PositionRepository positionRepository){
        User user = new User("Глад", "Валакас", "valakasglad@jmih.ru", "123", departamentRepository.findById(1L).get(), positionRepository.findById(1L).get());
        userRepository.save(user);
        }
    }
