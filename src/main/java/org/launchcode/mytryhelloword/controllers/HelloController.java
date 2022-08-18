package org.launchcode.mytryhelloword.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
public class HelloController {
    @ResponseBody
    @GetMapping()
    public String hello() {
        return "Hello, spring";
    }
    @ResponseBody
    @GetMapping("goodbye")
    public String bye() {
        return "Goodbye, spring";
    }
    // handles request of the form /hello?name=jisha
    //@GetMapping("hello")
    //@ResponseBody
    //public String helloParam(@RequestParam String name){
        //return "Hello "+ name +" !!!";
    //}
    // handles request of the form /hello/jisha
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello " +name+" !!!";
    }

}
