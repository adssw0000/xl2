package com.xlwh.framework.domain.manage;

import com.baomidou.mybatisplus.annotation.*;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * /* User: zdf
 * /* Date: 2019/10/6
 * /* Time: 15:06
 * /* Description:
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "xl_wx_group")
public class WxGroup {
    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    private String name;
    private String companyId;
    private String creator;
    private String creationTime;
    @TableLogic
    private Integer deleted;

    @TableField(exist = false)
    List<WxAccount> wxAccounts;
}
