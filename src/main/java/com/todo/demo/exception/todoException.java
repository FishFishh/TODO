package com.todo.demo.exception;

/**
 *   统一异常
 */
public class todoException extends Exception{
    private final Integer code;
    private final String message;

    public todoException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public todoException(todoExceptionEnum exceptionEnum){
        this(exceptionEnum.getCode(),exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
