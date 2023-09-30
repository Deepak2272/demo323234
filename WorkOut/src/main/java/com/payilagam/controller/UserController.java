package com.payilagam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payilagam.repository.UserRepo;
// hi
@RestController
public class UserController {

	@Autowired
	private UserRepo uRepo;
	
	@RequestMapping("addUser")
	public String addUser() {
		return "index.jsp";
	}
	
}
