package com.sryzzz.patient.wxapi.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.map.MapUtil;
import com.sryzzz.patient.wxapi.common.ResponseResult;
import com.sryzzz.patient.wxapi.controller.form.LoginOrRegisterForm;
import com.sryzzz.patient.wxapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;

/**
 * <p>
 * 患者相关接口
 * </p>
 *
 * @author ming
 * @create 2022/12/13 22:10
 * @description 患者相关接口
 */
@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    /**
     * 登录/注册
     */
    @PostMapping("/loginOrRegister")
    public ResponseResult loginOrRegister(@RequestBody @Valid LoginOrRegisterForm form) {
        HashMap<String, Object> map = userService.loginOrRegister(form.getCode(), form.getNickname(), form.getPhoto(), form.getSex());
        String msg = MapUtil.getStr(map, "msg");
        Integer id = MapUtil.getInt(map, "id");
        StpUtil.login(id);
        String token = StpUtil.getTokenValue();
        return ResponseResult.ok(msg).put("token", token);
    }
}
