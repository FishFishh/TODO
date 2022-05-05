package com.todo.demo.common;

import com.todo.demo.exception.todoExceptionEnum;

/**
 * 通用返回对象
 */
public class ApiRestResponse <T> {//在类的后面加上T，定义这个泛型
    private static final int OK_CODE = 10000;//当状态ok的时候码是10000
    private static final String OK_MSG = "SUCCESS";//当状态ok的时候信息是SUCCESS
    public Integer status;//返回状态码
    private String msg;//信息
    private T data;

    public ApiRestResponse(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ApiRestResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ApiRestResponse() {//无参的构造函数 说明是默认的信息
        this(OK_CODE,OK_MSG);
    }
    public static <T> ApiRestResponse<T> success(){//成功的时候调用的函数，返回一个刚刚的构造函数
        return new ApiRestResponse<>();
    }
    public static <T> ApiRestResponse<T> success(T result){//上面success的重载，有传参
        ApiRestResponse<T> response = new ApiRestResponse<>();
        response.setData(result);//携带了OK_CODE,OK_MSG，还有data
        return response;
    }
    public static <T> ApiRestResponse<T> error(Integer code,String msg){
        return new ApiRestResponse<>(code,msg);
    }
    public static <T> ApiRestResponse<T> error(todoExceptionEnum ex){
        return new ApiRestResponse<>(ex.getCode(),ex.getMsg());
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiRestResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
