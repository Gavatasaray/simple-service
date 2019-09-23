package com.api.web.api.controller;

import java.io.IOException;

import com.api.web.api.ApplicationApi;
import com.api.web.api.service.Service;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController implements ApplicationApi {

    @Autowired
    private Service service;

    @RequestMapping(value = "/postJson")
    @Override
    public HttpResponse postObject(@RequestBody String value) throws IOException {
        return service.executePostApi(value);
    }

    @RequestMapping(value = "/returnedValue")
    public void returnedValue(@RequestBody String value) {
        System.out.print(value);
    }

}
