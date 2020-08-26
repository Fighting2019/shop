package com.atzyy.shop.exceptions;

public class CommonException extends RuntimeException{
    private Integer code;
    private String message;

    public CommonException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonException() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
