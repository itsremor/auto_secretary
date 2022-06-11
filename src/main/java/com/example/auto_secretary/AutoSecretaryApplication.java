package com.example.auto_secretary;

import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.repository.DepartamentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutoSecretaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoSecretaryApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(DepartamentRepository departamentRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                for (int i = 0; i < 6; i++) {
                    Departament departament = new Departament("Департамент номер " + i);
                    departamentRepository.save(departament);
                }
            }
        };
    }
}
