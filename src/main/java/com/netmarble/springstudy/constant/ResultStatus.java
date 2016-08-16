package com.netmarble.springstudy.constant;

/**
 * Created by mydus on 2016-08-17.
 */
public enum ResultStatus {
    OK(0, "OK"),
    INTERNAL_SERVER_ERROR(5, "Internal server error"),

    EXIST_USER(100, "Exist user"),
    NOT_EXIST_USER(101, "Not exist user"),
    WRONG_PASSWORD(102, "Wrong password")
    ;
    private int code;
    private String message;
    ResultStatus(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
