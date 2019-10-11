package com.xlwh.framework.domain.manage;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * /* User: zdf
 * /* Date: 2019/10/6
 * /* Time: 15:34
 * /* Description:
 */
@Data
@ToString
@Accessors(chain = true)
@TableName(value = "xl_wx_group_account")
public class WxGroupAccount {

    private Long groupId;
    private String accountId;

}
