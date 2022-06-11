package com.example.auto_secretary.repository;
import com.example.auto_secretary.entity.Departament;
import com.example.auto_secretary.entity.Event;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface EventRepository extends JpaRepository<Event, Long>{
}
