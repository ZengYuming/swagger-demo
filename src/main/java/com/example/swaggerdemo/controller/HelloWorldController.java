package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.vo.HelloWorldRq;
import com.example.swaggerdemo.vo.HelloWorldRs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

@Api(value = "HelloWorldController", description = "HelloWorld的接口", tags = "HelloWorldApi", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {
    @ApiOperation(value = "getWorld", notes = "查询HelloWorld")
    @GetMapping("/world")
    public ResponseEntity getWorld() {
        return new ResponseEntity("hello world", HttpStatus.OK);
    }

    @ApiOperation(value = "addWorld", notes = "新增HelloWorld")
    @PostMapping("/world")
    public ResponseEntity addWorld(@Validated HelloWorldRq params) {
        return new ResponseEntity(new HelloWorldRs(80.9, "eath", "plant008"), HttpStatus.OK);
    }

}
