package com.api.web.api;

import com.utils.HttpConstants;

import org.apache.http.HttpResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Api(tags = {"Application API"})
@SwaggerDefinition(tags = {
    @Tag(name = "API Title", description = "API Description")})
public interface ApplicationApi {

    @ApiOperation(value = "Consumes JSON String and returns a first class object")
    @ApiResponses(value = {
        @ApiResponse(code = HttpConstants.SUCCESS, message = HttpConstants.SUCCESS_MESSAGE_DEFAULT),
        @ApiResponse(code = HttpConstants.BAD_REQUEST, message = HttpConstants.BAD_REQUEST_MESSAGE_DEFAULT),
        @ApiResponse(code = HttpConstants.NOT_FOUND, message = HttpConstants.NOT_FOUND_MESSAGE_DEFAULT),
        @ApiResponse(code = HttpConstants.INTERNAL_SERVER_ERROR, message = HttpConstants.INTERNAL_SERVER_ERROR_MESSAGE_DEFAULT)})
    @PostMapping(value = "/postJson",
        produces = {MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE})
    HttpResponse postObject(@RequestBody String value) throws Exception;
}
