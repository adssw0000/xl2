package com.xlwh.framework.domain.task;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author AmazingQ
 * @date 2019/10/7 10:37
 */
@Data
@ToString
@Accessors(chain = true)
@TableName(value = "xl_task_wxid")
public class TaskWxid {
    @TableId(value = "id")
    private Long id;
    private String textId;
    private String wxid;
    private String companyId;
    private String createTime;
    private Integer count;
    private Integer state;
    private String updateTime;
    @TableLogic
    private Integer deleted;
}
