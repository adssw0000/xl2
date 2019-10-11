package com.xlwh.framework.domain.task;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author AmazingQ
 * @date 2019/10/7 11:32
 */
@Data
@ToString
@Accessors(chain = true)
@TableName(value = "xl_task_add_friends")
public class TaskAddFriends {
    @TableId(value = "id")
    private Long id;
    private String companyId;   //公司id
    private Integer groupId;    //分组
    private String taskName;    //任务名
    private String textId;      //上传文本id
    private String code;        //设置来源  1 微信号  2 手机号  3 手机通讯录  4 QQ好友  5 wxid爆粉  6 只能识别
    private Long vMessageId;     //验证消息
    private String mark;        //标签
    private Long sayHelloId;     //打招呼信息
    private Integer schemeId;      //方案
    private Integer status;
    @TableLogic
    private Integer deleted;

}
