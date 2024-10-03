package com.spring.denarius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.denarius.model.Notifications;

@Repository
public interface NotificationsRepository extends JpaRepository<Notifications, Long> {
	
}
