package com.xlwh.framework.domain.manage;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 用户小号管理表
 * @author AmazingQ
 * @date 2019/9/25 13:37
 */
@Data
@ToString
@Accessors(chain = true)
@TableName(value = "xl_wx_allocate")
public class WxAllocate {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String userId;
    private String username;
    private String companyId;
    private String account;

    @TableField(exist = false)
    private WxAccount wxAccount;

}
