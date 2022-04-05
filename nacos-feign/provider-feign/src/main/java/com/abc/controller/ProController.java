package com.abc.controller;

import com.abc.UUser;
import com.abc.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProController {

    @RequestMapping("/pro1")
    public String pro1(){
        return "pro1 call";
    }


    @PostMapping("/pro2")
    public String pro2(String aa){
        return "pro2==>"+aa;
    }

    @GetMapping("/pro3")
    public String pro3(@RequestParam String BB){
        return "pro3==>"+BB;
    }

    @PostMapping("/pro4")
    public String pro4(User user){
        return user.getAaa();
    }

    @PostMapping("/pro5")
    public UUser pro5(@RequestBody UUser uUser){
        System.out.println(uUser);
        return uUser;
    }

    @PostMapping("/pro6")
    public UUser pro6 (@RequestBody UUser uUser){
        System.out.println(uUser);
        return uUser;
    }
}
