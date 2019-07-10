package com.jmh.pattern.adapter.login;

public class ResultData {

    private Object data;
    private boolean success;
    private String errCode;
    private String message;

    public ResultData(Object data, boolean success, String errCode, String message) {
        this.data = data;
        this.success = success;
        this.errCode = errCode;
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
