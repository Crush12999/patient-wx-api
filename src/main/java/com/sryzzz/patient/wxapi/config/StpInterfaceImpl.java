package com.sryzzz.patient.wxapi.config;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * SaToken配置
 *
 * @author sryzzz
 * @create 2022/11/12 21:05
 * @description SaToken配置
 */
@Component
public class StpInterfaceImpl implements StpInterface {

    /**
     * 返回一个用户所拥有的权限集合
     */
    @Override
    public List<String> getPermissionList(Object o, String s) {
        return null;
    }

    /**
     * 返回一个用户所拥有的角色标识集合
     */
    @Override
    public List<String> getRoleList(Object o, String s) {
        return null;
    }
}
