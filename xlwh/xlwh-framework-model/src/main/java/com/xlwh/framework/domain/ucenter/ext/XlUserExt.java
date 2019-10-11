package com.xlwh.framework.domain.ucenter.ext;

import com.xlwh.framework.domain.ucenter.XlMenu;
import com.xlwh.framework.domain.ucenter.XlUser;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author AmazingQ
 * @date 2019/9/20 16:03
 */
@Data
@ToString
public class XlUserExt extends XlUser {

    //权限信息
    private List<XlMenu> permissions;

    //企业信息
    private String companyId;
}
