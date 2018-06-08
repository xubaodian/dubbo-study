package com.xbd.demoapi.entity;

import java.io.Serializable;

public class RetMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
