package com.missionsky.bbs.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName(value = "comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comments {
    @TableId(value = "cmt_id",type = IdType.AUTO)//指定自增策略
    private long cmtId;
    private long postId;
    private long authorId;
    private long replyUserId;
    private String replyContent;
    private String quote;
    private Date replyTime;
    private long isRead;
    private long state;


}
