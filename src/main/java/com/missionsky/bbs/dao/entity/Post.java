package com.missionsky.bbs.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

/**
 * @author Administrator
 */
@TableName(value = "post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @TableId(value = "post_id",type = IdType.AUTO)//指定自增策略
    private long postId;
    private long userId;
    private Date publishTime;
    private Date updateTime;
    private String title;
    private String content;
    private long numReply;
    private long numRead;
    private long state;
    private long csid;
    private long essences;

    private String mark;
    private Integer fk_cid;
    private String csname;
    private String replyUserName;
    private Date lastReply;

    private User user;
}
