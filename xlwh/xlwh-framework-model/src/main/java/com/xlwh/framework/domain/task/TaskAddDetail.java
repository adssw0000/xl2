package com.xlwh.framework.domain.task;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author AmazingQ
 * @date 2019/10/9 16:07
 */
@Data
@ToString
@Accessors(chain = true)
@TableName(value = "xl_task_add_detail")
public class TaskAddDetail {
    private Long taskId;
    private String companyId;
    private String wxid;
    private String targetWxid;
    private Integer requestStatus;
    private Integer responseStatus;
    private String info;
    private String createTime;
    private String updateTime;
}
