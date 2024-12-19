package com.li.example.nativedemo.controller;


import com.li.example.nativedemo.entity.Messages;
import com.li.example.nativedemo.enums.MessageType;
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
        Messages messages = new Messages(null, "Hello MybatisPlus", MessageType.VOICE);
        messagesMapper.insert(messages);
        System.out.println("------------演示select-----------------");
        System.out.println("simple query:" + messagesMapper.selectById(messages.getId()));
        return messagesMapper.selectById(messages.getId());
    }
}
