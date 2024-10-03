package com.spring.denarius.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.denarius.model.Notifications;
import com.spring.denarius.repository.NotificationsRepository;

@RestController
@RequestMapping("/notifications")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NotificationsController {

	@Autowired
	private NotificationsRepository notificationsRepository;
	
	@GetMapping
	public ResponseEntity<List<Notifications>> getAll (){
		return ResponseEntity.ok(notificationsRepository.findAll());
	}
}
