package com.missionsky.bbs.service;


import com.missionsky.bbs.dao.entity.Post;

public interface PostService {
    Post getPostAndUserById(Integer postId);

}
