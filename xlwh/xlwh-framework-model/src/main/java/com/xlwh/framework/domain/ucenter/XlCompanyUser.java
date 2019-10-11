package com.xlwh.framework.domain.ucenter;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author AmazingQ
 * @date 2019/9/24 10:40
 */
@Data
@ToString
@TableName(value="xl_company_user")
public class XlCompanyUser {
    @TableId(value = "id",type = IdType.AUTO)
    private String id;
    private String companyId;
    private String userId;
}
