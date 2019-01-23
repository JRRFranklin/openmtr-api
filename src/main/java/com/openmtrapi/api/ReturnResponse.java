package com.openmtrapi.api;


public class ReturnResponse {

    protected int statusCode;
    protected String message;
    protected boolean error;
    protected String data;


    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void error(String message, Integer statusCode ) {
        if(statusCode == null) {
            statusCode = 400;
        }

        this.statusCode = statusCode;
        this.message = message;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "{ \"error\": " + this.error + ", \"error_msg\": " + this.message + ", \"status\": " + this.statusCode + ", \"data\": " + this.data + "}";
    }
}
