package com.springboot.jian.controller;

import com.springboot.jian.service.fixupUserMessage;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class fixupUser {
    //    修改用户名
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "fixupUser")
    public int fixupUser(
            @RequestParam String newName,
            @RequestParam String oldName
    ) throws IOException {
        fixupUserMessage fixupUserMessage = new fixupUserMessage();
        return fixupUserMessage.fixUpUser(newName, oldName);
    }
}
