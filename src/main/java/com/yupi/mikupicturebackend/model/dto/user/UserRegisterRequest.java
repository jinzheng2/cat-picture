package com.yupi.mikupicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 *
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = -5405896865721339098L;
    /**
     * 账号
     */
    private String userAccount;
    /**
     * 密码
     */
    private String userPassword;
    /**
     * 校验密码
     */
    private String checkPassword;
}
