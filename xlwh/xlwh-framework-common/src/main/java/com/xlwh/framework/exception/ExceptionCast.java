package com.xlwh.framework.exception;

import com.xlwh.framework.model.response.ResultCode;

/**
 * @author AmazingQ
 * @date 2019-07-22 20:22
 */
public class ExceptionCast {
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
