package com.springboot.jian.controller;

import com.springboot.jian.service.removeUserMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class removeUser {
//    删除用户
@PostMapping(value = "removeUser")
    public int removeUser(
            @RequestParam String name
    ) throws IOException {
        removeUserMessage removeUserMessage=new removeUserMessage();
        return removeUserMessage.removeUser(name);
    }
}
