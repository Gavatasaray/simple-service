package com.utils;

public class HttpConstants {
    public static final int SUCCESS = 200;
    public static final String SUCCESS_MESSAGE_DEFAULT = "Success";

    public static final int BAD_REQUEST = 400;
    public static final String BAD_REQUEST_MESSAGE_DEFAULT = "Bad request";

    public static final int NOT_FOUND = 404;
    public static final String NOT_FOUND_MESSAGE_DEFAULT = "The resource you were trying to reach is not found";

    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final String INTERNAL_SERVER_ERROR_MESSAGE_DEFAULT = "Unknown error occurred, please try again later";

    private HttpConstants() {
    }
}
