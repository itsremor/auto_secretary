package com.example.auto_secretary.service;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.entity.Position;
import com.example.auto_secretary.entity.User;
import com.example.auto_secretary.repository.DepartamentRepository;
import com.example.auto_secretary.repository.PositionRepository;
import com.example.auto_secretary.repository.UserRepository;

public class CreateDatabase {
    public static void createDepartaments(DepartamentRepository departamentRepository) {
        Departament departament = new Departament("Руководство компании");
        departamentRepository.save(departament);

        departament = new Departament("Отдел доставки");
        departamentRepository.save(departament);

        departament = new Departament("Отдел продаж");
        departamentRepository.save(departament);

        departament = new Departament("Административный отдел");
        departamentRepository.save(departament);

        departament = new Departament("Департамент HR");
        departamentRepository.save(departament);

        departament = new Departament("Бухгалтерский отдел");
        departamentRepository.save(departament);
        }

        public static void createPositions(PositionRepository positionRepository){
            Position position = new Position("Директор по мероприятиям", true);
            positionRepository.save(position);

            position = new Position("Курьер", false);
            positionRepository.save(position);

            position = new Position("Грузчик", false);
            positionRepository.save(position);

            position = new Position("Кадровый менеджер", false);
            positionRepository.save(position);

            position = new Position("HR менеджер", false);
            positionRepository.save(position);

            position = new Position("Администратор офиса", true);
            positionRepository.save(position);

            position = new Position("Бухгалтер", true);
            positionRepository.save(position);
        }

        public static void createUsers(UserRepository userRepository, DepartamentRepository departamentRepository, PositionRepository positionRepository){
        User user = new User("Глад", "Валакас", "valakasglad@jmih.ru", "123", departamentRepository.findById(1L).get(), positionRepository.findById(1L).get());
        userRepository.save(user);
        }
    }
