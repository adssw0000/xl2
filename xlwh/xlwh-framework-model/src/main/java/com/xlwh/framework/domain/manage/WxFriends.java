package com.xlwh.framework.domain.manage;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * /* User: zdf
 * /* Date: 2019/9/25
 * /* Time: 9:47
 * /* Description: 朋友
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "xl_wx_friends")
public class WxFriends {
    @TableId(value = "id" ,type = IdType.AUTO)
    private long  id;
    private String  parentId;
    private String  wxId;
    private String  acount;
    private String  wxName;
    private String  area;
    private String  sex;
    private String  wxPic;
    private String  signature;
    private String  status;
    private String  source;
    private String  remark;
}
