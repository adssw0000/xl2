package com.xlwh.framework.domain.ucenter;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import java.util.Date;

/**
 * @author AmazingQ
 * @date 2019/9/20 16:03
 */
@Data
@ToString
@TableName(value="xl_user_role")
public class XlUserRole {
    @TableId(value = "id",type = IdType.AUTO)
    private String id;
    private String userId;
    private String roleId;
    private String creator;
    private Date createTime;

}
