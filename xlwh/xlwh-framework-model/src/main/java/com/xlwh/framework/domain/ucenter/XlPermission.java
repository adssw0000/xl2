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
@TableName(value="xl_permission")
public class XlPermission {

    @TableId(value = "id",type = IdType.AUTO)
    private String id;
    private String role_id;
    private String menu_id;
    private Date create_time;


}
