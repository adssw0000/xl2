package com.xlwh.framework.domain.manage;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * /* User: zdf
 * /* Date: 2019/9/25
 * /* Time: 16:28
 * /* Description:
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "xl_wx_user")
public class WxUser {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String companyId;
    private String name;
    private Integer userType;
    private Date createTime;
    private String lastLoginTime;
    private String lastIp;
    private String status;
}
