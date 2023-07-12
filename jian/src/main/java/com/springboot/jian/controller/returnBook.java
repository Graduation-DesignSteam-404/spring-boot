package com.springboot.jian.controller;

import com.springboot.jian.service.returnBookMessage;
import com.springboot.jian.service.selectAllBookMessage;
import com.springboot.jian.service.selectAllUserMessage;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class returnBook {
    //    归还图书业务
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "returnBook")
    public int returnBook(
            @RequestParam String book,
            @RequestParam String user
    ) throws IOException {
        int result = 0;
        returnBookMessage returnBookMessage = new returnBookMessage();
        selectAllBookMessage selectAllBookMessage = new selectAllBookMessage();
        selectAllUserMessage selectAllUserMessage = new selectAllUserMessage();
        //        判断图书是否存在
        for (int i = 0; i < selectAllBookMessage.selectAllBook().size(); i++) {
            if (selectAllBookMessage.selectAllBook().get(i) == book) {
//                判断用户是否存在
                for (int j = 0; j < selectAllUserMessage.selectAllUser().size(); j++) {
                    if (selectAllUserMessage.selectAllUser().get(j) == user) {
                        result = returnBookMessage.returnBook(book, user);
                    } else {
                        result = -2;
                    }
                }
            } else {
                result = -1;
            }
        }
        return result;
    }
}
