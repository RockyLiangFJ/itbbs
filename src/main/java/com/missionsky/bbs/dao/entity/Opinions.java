package com.missionsky.bbs.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName(value = "opinions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Opinions {
    @TableId(value = "favo_id",type = IdType.AUTO)//指定自增策略
    private long opinionId;
    private long userId;
    private long cmtId;
    private long postId;
    private long agree;
    private long disagree;

}
