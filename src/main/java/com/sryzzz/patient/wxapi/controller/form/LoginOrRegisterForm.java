package com.sryzzz.patient.wxapi.controller.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * <p>
 * 患者登录/注册请求参数
 * </p>
 *
 * @author ming
 * @create 2022/12/13 22:09
 * @description 患者登录/注册请求参数
 */
@Data
public class LoginOrRegisterForm {

    @NotBlank(message = "code不能为空")
    private String code;

    @NotBlank(message = "nickname不能为空")
    private String nickname;

    @NotBlank(message = "photo不能为空")
    private String photo;

    @NotBlank(message = "sex不能为空")
    @Pattern(regexp = "^男$|^女$", message = "sex内容不正确")
    private String sex;

}
