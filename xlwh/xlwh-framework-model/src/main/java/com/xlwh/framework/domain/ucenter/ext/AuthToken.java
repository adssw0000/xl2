package com.xlwh.framework.domain.ucenter.ext;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author AmazingQ
 * @date 2019/9/20 16:03
 */
@Data
@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class AuthToken {
    String access_token; //访问token 端令牌 jti 用户身份令牌
    String refresh_token;//刷新token
    String jwt_token;//jwt令牌
}
