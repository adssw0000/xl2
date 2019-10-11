package com.xlwh.framework.domain.task;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author AmazingQ
 * @date 2019/10/7 13:33
 */
@Data
@ToString
@Accessors(chain = true)
@TableName(value = "xl_task_scheme")
public class TaskScheme {
    @TableId(value = "id")
    private Long id;
    private String name;       //方案名
    private String username;    //用户名
    private String scheme;      //方案 JSON
    private String companyId;   //公司id
    private String createTime;
    @TableLogic
    private Integer deleted;   //逻辑删除
}
