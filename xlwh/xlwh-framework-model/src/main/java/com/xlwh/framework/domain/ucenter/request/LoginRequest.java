package com.xlwh.framework.domain.ucenter.request;

import com.xlwh.framework.model.request.RequestData;
import lombok.Data;
import lombok.ToString;

/**
 * @author AmazingQ
 * @date 2019/9/20 15:23
 */
@Data
@ToString
public class LoginRequest extends RequestData {
    String username;
    String password;
    String verifycode;

}
