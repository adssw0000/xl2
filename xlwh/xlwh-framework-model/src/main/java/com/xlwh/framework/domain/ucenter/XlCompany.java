package com.xlwh.framework.domain.ucenter;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author AmazingQ
 * @date 2019/9/24 10:33
 */
@Data
@ToString
@TableName(value="xl_company")
public class XlCompany implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private String id;
    private String name;
    private String logo;
    private String intro;
    private String email;
    private String mobile;
    private String identitypic;
    private String worktype;
    private String businesspic;
    private String status;
}
