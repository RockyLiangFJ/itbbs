package com.missionsky.bbs.dao.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;
/**
 * @author Administrator
 */
@TableName(value = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "user_id",type = IdType.AUTO)//指定自增策略
    private long userId;
    private String userName;
    private String password;
    private String mark;
    private long levels;
    private long postNum;
    private long themeNum;
    private long praiseNum;
    private long score;
    private long coin;
    private long sex;
    private String phoneNum;
    private String email;
    private Date registerTime;
    private String address;
    private String imgPath;
    private long state;


}
