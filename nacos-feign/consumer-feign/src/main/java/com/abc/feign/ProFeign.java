package com.abc.feign;


import com.abc.UUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider-feign")
public interface ProFeign {

    @GetMapping("/pro1")
    public String pro1();


    @PostMapping("/pro2")
    public String pro2(@RequestParam("aa") String aa);

    @GetMapping("/pro3")
    public String pro3(@RequestParam("BB") String aa);

    @PostMapping("/pro4")
    public String pro4(@RequestParam("aaaa") String aa, @RequestParam("BBB") String bb);

    @PostMapping("/pro5")
    public UUser pro5(@RequestBody UUser uUser);

    @PostMapping("/pro6")
    public UUser pro6(UUser uUser);
}
