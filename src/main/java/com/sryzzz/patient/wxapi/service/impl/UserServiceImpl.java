package com.sryzzz.patient.wxapi.service.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sryzzz.patient.wxapi.db.entity.User;
import com.sryzzz.patient.wxapi.db.mapper.UserInfoCardMapper;
import com.sryzzz.patient.wxapi.db.mapper.UserMapper;
import com.sryzzz.patient.wxapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * <p>
 * 患者接口业务处理层实现类
 * </p>
 *
 * @author ming
 * @create 2022/12/13 22:02
 * @description 患者接口业务处理层实现类
 */
@RequiredArgsConstructor
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Value("${wechat.app-id}")
    private String appId;

    @Value("${wechat.app-secret}")
    private String appSecret;

    private final UserMapper userMapper;

    private final UserInfoCardMapper userInfoCardMapper;

    @Override
    public HashMap<String, Object> loginOrRegister(String code,
                                                   String nickname,
                                                   String photo,
                                                   String sex) {
        // 用临时授权兑换open_id
        String openId = this.getOpenId(code);

        HashMap<String, Object> map = new HashMap<>();
        // 是否为已注册用户
        Integer id = userMapper.searchAlreadyRegistered(openId);
        if (id == null) {
            User entity = new User();
            entity.setOpenId(openId);
            entity.setNickname(nickname);
            entity.setPhoto(photo);
            entity.setSex(sex);
            entity.setStatus((byte) 1);
            // 执行新用户注册
            userMapper.insert(entity);
            // 查询新用户的主键值
            id = userMapper.searchAlreadyRegistered(entity.getOpenId());
            map.put("msg", "注册成功");
        } else {
            map.put("msg", "登陆成功");
        }
        // 查询患者信息卡中的电话号码
        String tel = userInfoCardMapper.searchUserTel(id);
        map.put("id", id);
        map.put("tel", tel);
        return map;
    }

    /**
     * 获取患者微信的 open_id 字符串
     */
    private String getOpenId(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        HashMap<String, Object> map = new HashMap<>();
        map.put("appid", appId);
        map.put("secret", appSecret);
        map.put("js_code", code);
        map.put("grant_type", "authorization_code");
        String response = HttpUtil.post(url, map);
        JSONObject json = JSONUtil.parseObj(response);
        String openId = json.getStr("openid");
        if (openId == null || openId.length() == 0) {
            throw new RuntimeException("临时登陆凭证错误");
        }

        return openId;
    }
}
