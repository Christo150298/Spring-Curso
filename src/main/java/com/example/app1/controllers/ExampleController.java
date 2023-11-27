package com.example.app1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
@RequestMapping(path = "example")

public class ExampleController {
    @RequestMapping(path = "hello")  //http://.../example/hello
    @ResponseBody
    public String hola() {
        return  "Hola";
    }

    @RequestMapping(path = "date")  //http://.../example/date
    @ResponseBody
    public LocalDateTime hora() {
        return LocalDateTime.now();
    }
}