package com.missionsky.bbs.dao.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName(value = "chats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chats {
    @TableId(value = "chat_id",type = IdType.AUTO)//指定自增策略
    private long chatId;
    private long fromUserId;
    private long toUserId;
    private Date time;
    private long isRead;
    private long state;
    private String sendMsg;



}
