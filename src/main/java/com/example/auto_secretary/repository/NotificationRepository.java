package com.example.auto_secretary.repository;
import com.example.auto_secretary.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
