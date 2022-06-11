package com.example.auto_secretary.repository;
import com.example.auto_secretary.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long>{

}
