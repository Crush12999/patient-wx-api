package com.sryzzz.patient.wxapi.common;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一响应格式包装类
 *
 * @author sryzzz
 * @create 2022/11/12 13:50
 * @description ResponseResult
 */
public class ResponseResult extends HashMap<String, Object> {

    public ResponseResult() {
        put("code", HttpStatus.SC_OK);
        put("msg", "success");
    }

    @Override
    public ResponseResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public static ResponseResult ok() {
        return new ResponseResult();
    }

    public static ResponseResult ok(String msg) {
        ResponseResult r = new ResponseResult();
        r.put("msg", msg);
        return r;
    }

    public static ResponseResult ok(Map<String, Object> map) {
        ResponseResult r = new ResponseResult();
        r.putAll(map);
        return r;
    }

    public static ResponseResult error(int code, String msg) {
        ResponseResult r = new ResponseResult();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static ResponseResult error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static ResponseResult error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }
}
