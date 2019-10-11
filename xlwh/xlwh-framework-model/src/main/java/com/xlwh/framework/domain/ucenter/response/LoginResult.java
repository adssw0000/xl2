package com.xlwh.framework.domain.ucenter.response;

import com.xlwh.framework.model.response.ResponseResult;
import com.xlwh.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author AmazingQ
 * @date 2019/9/20 15:23
 */
@Data
@ToString
@NoArgsConstructor
public class LoginResult extends ResponseResult {
    public LoginResult(ResultCode resultCode, String token) {
        super(resultCode);
        this.token = token;
    }
    private String token;
}
