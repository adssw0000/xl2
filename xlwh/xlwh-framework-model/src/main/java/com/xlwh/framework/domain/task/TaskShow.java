package com.xlwh.framework.domain.task;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author AmazingQ
 * @date 2019/10/8 11:17
 */
@Data
@ToString
@Accessors(chain = true)
public class TaskShow {
    private Integer orders;         //总订单数
    private Integer addFans;        //添加粉丝总数
    private Integer success;        //添加成功人数
    private Integer today;          //今日添加成功人数
    private Integer incomplete;     //未添加的人数
}
