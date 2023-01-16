package com.ino.springex.controller;

import com.ino.springex.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @RequestMapping("/list")
    public void list() {
        log.info("todo list..........");
    }

    //    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void registerGET() {
        log.info("GET todo register..........");
    }

    @PostMapping("/register")
    public void registerPOST(TodoDTO todoDTO) {
        log.info("POST todo register..........");
        log.info(todoDTO);
    }

    @GetMapping("/ex1")
    public void ex1(String name, int age) {
        log.info("ex1..........");
        log.info("name : " + name);
        log.info("age : " + age);
    }
}
