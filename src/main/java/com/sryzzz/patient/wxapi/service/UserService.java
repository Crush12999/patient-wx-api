package com.sryzzz.patient.wxapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sryzzz.patient.wxapi.db.entity.User;

import java.util.HashMap;

/**
 * <p>
 * 患者接口业务处理层
 * </p>
 *
 * @author ming
 * @create 2022/12/13 22:00
 * @description 患者接口业务处理层
 */
public interface UserService extends IService<User> {

    /**
     * 登录/注册
     *
     * @param code     临时授权码
     * @param nickname 昵称
     * @param photo    用户头像
     * @param sex      性别
     * @return 患者信息卡中的电话号码
     */
    HashMap<String, Object> loginOrRegister(String code, String nickname, String photo, String sex);
}
