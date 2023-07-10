package com.springboot.jian.controller;

import com.springboot.jian.service.fixupUserMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class fixupUser {
    //    修改用户名
    @PostMapping(value = "fixupUser")
    public int fixupUser(
            @RequestParam String newName,
            @RequestParam String oldName
    ) throws IOException {
        fixupUserMessage fixupUserMessage = new fixupUserMessage();
        return fixupUserMessage.fixUpUser(newName, oldName);
    }
}
