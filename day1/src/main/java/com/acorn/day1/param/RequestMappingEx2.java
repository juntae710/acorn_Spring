package com.acorn.day1.param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingEx2 {
  
    
    @RequestMapping("/user")     
    public void test1( User user){ 
        System.out.println(user);
        System.out.println(user.getId());
        System.out.println(user.getPw());
    }
}
