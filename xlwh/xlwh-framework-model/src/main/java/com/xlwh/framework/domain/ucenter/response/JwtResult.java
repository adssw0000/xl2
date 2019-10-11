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
public class JwtResult extends ResponseResult {
    public JwtResult(ResultCode resultCode, String jwt) {
        super(resultCode);
        this.jwt = jwt;
    }
    private String jwt;
}
