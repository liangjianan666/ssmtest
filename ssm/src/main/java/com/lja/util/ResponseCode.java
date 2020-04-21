package com.lja.util;

import lombok.Data;

/**
 * 包名称： com.lja.util
 * 类名称：ResponseCode
 * 类描述：TODO
 * 创建人：@author LiangJianAn
 * 创建时间：2020/4/2 14:11
 */
@Data
public class ResponseCode {
    private String statusCode;
    private String message;
    private Object data;

    public static ResponseCode build(String statusCode, String message , Object data){
        return new ResponseCode(statusCode,message, data);
    }

    public ResponseCode() {
    }

    public ResponseCode(String statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }
}

