package com.springboot.jian.controller;

import com.springboot.jian.service.recordMessage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class recordBusiness {
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "recordBusiness")
    public List<Object> record() throws IOException {
        recordMessage recordMessage=new recordMessage();
        return recordMessage.record();
    }
}
