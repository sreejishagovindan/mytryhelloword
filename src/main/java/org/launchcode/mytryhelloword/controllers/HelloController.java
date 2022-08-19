package org.launchcode.mytryhelloword.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

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


    public String helloParam(@RequestParam String name, Model model){
       String greeting="hello " + name + " !!!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }
    // handles request of the form /hello/jisha
    @GetMapping("{name}")

    public String helloWithPathParam(@PathVariable String name,Model model){
        String greeting="hello " + name + " !!!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }
    @GetMapping("form")
// it lives at /hello/form as we have requestmapping("hello")  annotation above the class
    public String helloForm(){
        return "form";
    }
    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names=new ArrayList<>();
        names.add("Launch Code");
        names.add("Java");
        names.add("Java Script");
        model.addAttribute("names",names);
        return "hello-list";
    }

}
