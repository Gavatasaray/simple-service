package com.api.web.api.service.impl;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ServerErrorException;

import net.minidev.json.JSONObject;

@Service
@EnableRetry
public class ServiceImpl implements com.api.web.api.service.Service {

    @Retryable(
        include = ServerErrorException.class,
        exclude = HttpClientErrorException.class,
        maxAttemptsExpression = "#{${java.rest.maxRetries}}", backoff = @Backoff(delayExpression = "#{${java.rest.waitTime}}",
        multiplierExpression = "#{${java.rest.exponentialGrowth}}"))
    public HttpResponse executePostApi(String entity) throws IOException {
        URI url = URI.create("http://localhost:8080/receiveJson").normalize();

        JSONObject value = new JSONObject();
        value.put("Test", "POST Test");
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(value.toString()));
        httpPost.addHeader("content-type", "application/json");
        return HttpClientBuilder.create().build().execute(httpPost);
    }
}
