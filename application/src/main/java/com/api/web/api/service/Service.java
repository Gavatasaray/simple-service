package com.api.web.api.service;

import java.io.IOException;

import org.apache.http.HttpResponse;

public interface Service {

    HttpResponse executePostApi(String entity) throws IOException;

}
