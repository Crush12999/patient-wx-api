package com.sryzzz.patient.wxapi.exception;

import lombok.Getter;

/**
 * 自定义异常
 *
 * @author sryzzz
 * @create 2022/11/12 13:41
 * @description 自定义异常
 */
@Getter
public class HospitalException extends RuntimeException {

    private final String msg;
    private int code = 500;

    public HospitalException(Exception e) {
        super(e);
        this.msg = "执行异常";
    }

    public HospitalException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public HospitalException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public HospitalException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public HospitalException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

}
