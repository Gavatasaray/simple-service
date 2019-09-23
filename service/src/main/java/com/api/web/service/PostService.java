package com.api.web.service;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;

public interface PostService {

    void returnObject(@RequestBody String value) throws IOException;
}
