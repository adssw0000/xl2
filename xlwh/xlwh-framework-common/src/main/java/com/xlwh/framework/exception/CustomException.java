package com.xlwh.framework.exception;


import com.xlwh.framework.model.response.ResultCode;

/**
 * @author AmazingQ
 * @date 2019-07-22 20:17
 */
public class CustomException extends RuntimeException {
    ResultCode resultCode;
    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode(){
        return resultCode;
    }
}
