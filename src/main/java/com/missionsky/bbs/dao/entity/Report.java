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
@TableName(value = "report")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    @TableId(value = "report_id",type = IdType.AUTO)//指定自增策略
    private long reportId;
    private long reportUserId;
    private long reportedUserId;
    private String reason;
    private long postId;
    private long hide;
    private long cmtId;
    private Date reportTime;
    private long result;
}
