package com.tistory.f5074.spring_boot.common;

import org.springframework.lang.NonNull;

import java.util.List;


public class ApiResponse<T> {
    @NonNull private T data;
    private String errors;

    @NonNull
    public T getData() {
        return data;
    }

    public void setData(@NonNull T data) {
        this.data = data;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

}
