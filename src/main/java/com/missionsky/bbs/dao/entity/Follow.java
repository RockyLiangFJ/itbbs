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
@TableName(value = "follow")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Follow {
    @TableId(value = "folw_id",type = IdType.AUTO)//指定自增策略
    private long folwId;
    private long userId;
    private long folwUid;


}
