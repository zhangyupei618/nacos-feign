package com.abc.controller;

import com.abc.UUser;
import com.abc.feign.ProFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConController {


    @Autowired
    private ProFeign proFeign;
    @RequestMapping("/con1")
    public String con1(){
        String s = proFeign.pro1();
        return "con1==>"+s;
    }

    @PostMapping("/con2")
    public String con2( String aa){
      String bb =   proFeign.pro2(aa);
        return "con2-->"+aa+"==>"+bb;
    }

    @GetMapping("/con3")
    public String con3(@RequestParam String BB){
        String s = proFeign.pro3(BB);
        return "con3-->"+s;
    }

    @PostMapping("/con4")
    public String con4(String aa,@RequestParam String bb){
        String s = proFeign.pro4(aa, bb);
        return "con4==>"+s;
    }

    @PostMapping("/con5")
    public String con5(@RequestBody UUser uUser){
        System.out.println(uUser);
        proFeign.pro5(uUser);
        return uUser.getId();
    }

    @PostMapping("/con6")
    public String con6(UUser uUser){
        System.out.println(uUser);
        proFeign.pro6(uUser);
        return uUser.getId();
    }
}
