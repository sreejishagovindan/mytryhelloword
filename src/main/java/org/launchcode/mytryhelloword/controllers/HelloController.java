package org.launchcode.mytryhelloword.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("hello")
    public String hello() {
        return "Hello, spring";
    }
    @ResponseBody
    @GetMapping("goodbye")
    public String bye() {
        return "Goodbye, spring";
    }
}
