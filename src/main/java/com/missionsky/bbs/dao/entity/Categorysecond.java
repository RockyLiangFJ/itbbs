package com.missionsky.bbs.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@TableName(value = "categorysecond")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorysecond {
    @TableId(value = "csid",type = IdType.AUTO)//指定自增策略
    private long csid;
    private String csname;

    private long fkCid;
    private String csImgPath;

    private Integer postNum;
    private String cname;
    private Integer todayPostNum;
    private Integer postMsgNum;
    private Date lastPost;

}
