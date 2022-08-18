package org.launchcode.mytryhelloword.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
   @RequestMapping(method={RequestMethod.GET,RequestMethod.POST},value="hello")
    @ResponseBody
    public String helloParam(@RequestParam String name){
        return "Hello "+ name +" !!!";
    }
    // handles request of the form /hello/jisha
   // @GetMapping("hello/{name}")
   // @ResponseBody
    //public String helloWithPathParam(@PathVariable String name){
        //return "Hello " +name+" !!!";
    //}
    @GetMapping("form")
    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +//submit the request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet Me'>" +
                "</form>" +
                "</body>" +
                "<html>";
    }

}
