package com.missionsky.bbs.service.impl;


import com.missionsky.bbs.dao.entity.Post;
import com.missionsky.bbs.dao.mapper.PostMapper;
import com.missionsky.bbs.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class PostServiceImpl implements PostService {
    @Resource
    private PostMapper postMapper;

    @Override
    public Post getPostAndUserById(Integer postId) {
        return postMapper.getPostAndUserById(postId);
    }
}
