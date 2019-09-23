package com.api.web.controller;

import java.io.IOException;

import com.api.web.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/receiveJson")
    public void receivedValue(@RequestBody String value) throws IOException {
        postService.returnObject(value);
    }
}
