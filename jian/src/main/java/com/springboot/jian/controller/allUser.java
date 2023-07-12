package com.springboot.jian.controller;

import com.springboot.jian.service.allUserMessage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class allUser {
    //    查询所有用户信息
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping(value = "allUser")
    public List<Object> allUser() throws IOException {
        allUserMessage allUserMessage = new allUserMessage();
        return allUserMessage.allUser();
    }
}
