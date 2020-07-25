package com.missionsky.bbs.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@TableName(value = "favorite")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favorite {
    @TableId(value = "favo_id",type = IdType.AUTO)//指定自增策略
    private long favoId;
    private long userId;
    private long postId;
}
