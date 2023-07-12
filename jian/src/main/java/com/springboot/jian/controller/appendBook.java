package com.springboot.jian.controller;

import com.springboot.jian.service.appendBookMessage;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class appendBook {
    //    添加图书
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "appendBook")
    public int appendBook(
            @RequestParam String name,
            @RequestParam String author
    ) throws IOException {
        appendBookMessage appendBookMessage = new appendBookMessage();
        return appendBookMessage.appendBook(name, author);
    }
}
