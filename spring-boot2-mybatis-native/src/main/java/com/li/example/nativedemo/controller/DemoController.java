package com.li.example.nativedemo.controller;


import com.li.example.nativedemo.entity.Messages;
import com.li.example.nativedemo.mapper.MessagesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @Autowired
    private MessagesMapper messagesMapper;

    // demo请求
    @GetMapping
    public Object demo() {
        Messages messages = messagesMapper.select(1l);
        return messages;
    }
}
