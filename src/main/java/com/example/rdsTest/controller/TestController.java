package com.example.rdsTest.controller;

import com.example.rdsTest.domain.User;
import com.example.rdsTest.domain.UserDTO;
import com.example.rdsTest.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestRepository testRepository;
    @GetMapping("/test/read")
    public String helloController(){
        return "hello";
    }
    @PostMapping("/test/create")
    public String createController(@RequestBody UserDTO userDTO){
        User user=testRepository.createUser(userDTO.getName());
        System.out.println(user.getName());
        return user.getName();
    }
}
