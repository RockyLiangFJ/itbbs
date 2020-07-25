package com.missionsky.bbs.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@TableName(value = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "cid",type = IdType.AUTO)//指定自增策略
    private long cid;
    private String cname;
    private List<Categorysecond> categoryseconds;	//次板块集合
}
