package com.moon.consumer.controller;

import com.moon.demo.dto.CarDto;
import com.moon.demo.serivce.MadeCarService;
import com.moon.demo.serivce.SayService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class SayController {

    @DubboReference
    private SayService sayService;

    @DubboReference
    private MadeCarService madeCarService;

    @GetMapping("/sayHello")
    public ResponseEntity<String> sayHello(@RequestParam("name") String name) {
        return ResponseEntity.ok(sayService.sayHelloByName(name));
    }

    @GetMapping("/makeCar")
    public ResponseEntity<CarDto> makeCar(){
        return ResponseEntity.ok(madeCarService.made());
    }
}
