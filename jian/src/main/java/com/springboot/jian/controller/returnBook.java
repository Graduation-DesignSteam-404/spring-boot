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
        boolean bookMessage = false;
        boolean userMessage = false;
        returnBookMessage returnBookMessage = new returnBookMessage();
        selectAllUserMessage selectAllUserMessage = new selectAllUserMessage();
        //        判断图书是否存在
        for (int i = 0; i < com.springboot.jian.service.selectAllBookMessage.selectAllBook().size(); i++) {
            if (com.springboot.jian.service.selectAllBookMessage.selectAllBook().get(i).equals(book)) {
                bookMessage = true;
                break;
            }
        }
//        判断用户是否存在
        for (int j = 0; j < selectAllUserMessage.selectAllUser().size(); j++) {
            if (selectAllUserMessage.selectAllUser().get(j).equals(user)) {
                result = returnBookMessage.returnBook(book, user);
                userMessage = true;
                break;
            }
        }
        if (!bookMessage) {
            result = -1;
        }
        if (!userMessage) {
            result = -2;
        }
        if (bookMessage && userMessage) {
            result = 1;
        }
        return result;
    }
}
