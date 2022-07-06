package com.krizan.user.controller;

import com.krizan.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public record UserController(UserService userService) {
}
