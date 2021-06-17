package com.xtyu.toolapi.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: smile
 * @date: 2021/6/15 09:25
 * @description:iphone 17521111022
 */
@Data
public class WxUser {
    private Long id;
    private String name;
    private Integer videoNumber;
    private String openId;
    private Integer signInSum;//累计签到次数
    private Date endSignInTime;//最后签到时间
    private Date createTime;
}