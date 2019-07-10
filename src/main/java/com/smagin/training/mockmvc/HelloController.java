package com.smagin.training.mockmvc;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;

    @GetMapping("/ping")
    public String pong(){
        return helloService.ping();
    }

    @PostMapping("/pong")
    public String ping(){
        return  helloService.ping();
    }
}
