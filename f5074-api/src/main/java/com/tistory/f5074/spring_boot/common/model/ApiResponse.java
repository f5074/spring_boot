package com.tistory.f5074.spring_boot.common.model;

public class ApiResponse<T> {
    private T data;
    private String errors;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
}
