package org.launchcode.mytryhelloword.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Controller


public class HelloController {

    @GetMapping()
    @ResponseBody
    public String hello() {
        return "Hello, spring";
    }
// it lives at /hello/goodbye as we have requestmapping("hello") above the class
    @GetMapping("goodbye")
    @ResponseBody
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
    @GetMapping("{name}")
   @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello " +name+" !!!";
    }
    @GetMapping("form")
// it lives at /hello/form as we have requestmapping("hello")  annotation above the class
    public String helloForm(){
        return "form";
    }

}
