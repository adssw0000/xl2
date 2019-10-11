package com.xlwh.framework.domain.manage;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author AmazingQ
 * @date 2019/9/18 14:51
 */
@Data
@ToString
@Accessors(chain = true)
@TableName(value = "xl_wx_account")
public class WxAccount implements Serializable {
    @TableId(value = "account")
    private String account;
    private String wxid;
    private String phone;
    private String data62;
    private String a16;
    private String companyId;
    private String password;
    private String wxName;
    private String wxPic;
    private String wxCode;
    private String sex;
    private String area;
    private String signature;
    private String createTime;
    private String status;
    private Integer line;
    private Integer api;
    @TableLogic
    private Integer deleted;

    @TableField(exist = false)
    private WxAllocate wxAllocate;
}
