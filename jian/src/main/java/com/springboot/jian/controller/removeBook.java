package com.springboot.jian.controller;

import com.springboot.jian.service.removeBookMessage;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class removeBook {
    //    删除图书
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "removeBook")
    public int removeBook(
            @RequestParam String name
    ) throws IOException {
        removeBookMessage removeBookMessage = new removeBookMessage();
        return removeBookMessage.removeBook(name);
    }
}
