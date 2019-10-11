package com.xlwh.framework.domain.task.ext;

import com.xlwh.framework.domain.task.TaskAddFriends;
import lombok.Data;
import lombok.ToString;

/**
 * @author AmazingQ
 * @date 2019/10/9 9:06
 */
@Data
@ToString
public class TaskExt extends TaskAddFriends {
    private Integer taskTotal;      //任务总数量
    private Double schedule;        //任务进度
    private Integer success;        //任务成功数
}
