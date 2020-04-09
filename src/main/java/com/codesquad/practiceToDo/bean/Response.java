package com.codesquad.practiceToDo.bean;

import lombok.Getter;

@Getter
public class Response {
    public enum Status { SUCCESS, ERROR }
    private Status status;
    private Object message;

    public Response(Status status, Object message) {
        this.status = status;
        this.message = message;
    }
}
