package com.scaler.productservice_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class sampleController
{
    @GetMapping("/hello/{name}/{times}")
    public String sayHello( @PathVariable("name") String name,@PathVariable("times") int times)
    {
        String str="";
        for(int i=0;i<times;i++)
        {
            str=str+" hai "+name;
        }
        return str;
    }
    @GetMapping("/bye")
    public String sayBye()
    {
        return "Bye World";
    }
}
