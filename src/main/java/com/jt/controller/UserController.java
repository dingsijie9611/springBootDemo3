package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jt.mapper.UserMapper;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
}
