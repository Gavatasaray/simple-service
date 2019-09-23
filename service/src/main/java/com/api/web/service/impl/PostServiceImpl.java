package com.api.web.service.impl;

import java.io.IOException;
import java.net.URI;

import com.api.web.service.PostService;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Override
    public void returnObject(String value) throws IOException {
        URI url = URI.create("http://localhost:8081/returnedValue").normalize();

        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("content-type", "application/json");

        httpPost.setEntity(new StringEntity(value));
        HttpClientBuilder.create().build().execute(httpPost);
    }
}
