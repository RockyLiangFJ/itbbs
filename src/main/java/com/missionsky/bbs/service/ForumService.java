package com.missionsky.bbs.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.missionsky.bbs.dao.entity.Categorysecond;
import com.missionsky.bbs.dao.entity.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public interface ForumService {
    List<Categorysecond> getCategorySecond(Integer csid);

    IPage<Post> getPostByCidOrCsid(Page<Post> page,Integer cid,Integer csid);

    //IPage<Post> getPostByCsid(Page<Post> page, Integer csid);



}