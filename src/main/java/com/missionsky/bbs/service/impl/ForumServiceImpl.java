package com.missionsky.bbs.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.missionsky.bbs.dao.entity.Categorysecond;
import com.missionsky.bbs.dao.entity.Post;
import com.missionsky.bbs.dao.mapper.CategorySecondMapper;
import com.missionsky.bbs.dao.mapper.PostMapper;
import com.missionsky.bbs.service.ForumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Service
public class ForumServiceImpl implements ForumService {
    @Resource
    private PostMapper postMapper;

    @Resource
    private CategorySecondMapper categorySecondMapper;

    @Override
    public List<Categorysecond> getCategorySecond(Integer csid) {
        return categorySecondMapper.getCategorySecond(csid);
    }

    @Override
    public IPage<Post> getPostByCsid(Page<Post> page, Integer csid) {

        return postMapper.getPostByCsid(page,csid);

    }

}
