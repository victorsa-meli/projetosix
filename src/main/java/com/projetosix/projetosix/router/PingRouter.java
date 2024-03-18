package com.projetosix.projetosix.router;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingRouter {

     @GetMapping
     String ping (){

         return "pong";
    }


}