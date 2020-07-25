package com.missionsky.bbs.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.missionsky.bbs.dao.entity.User;
import com.missionsky.bbs.dao.mapper.UserMapper;
import com.missionsky.bbs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public User selUserNameAndPwd(Wrapper<User> user){
        return userMapper.selectOne(user);
    }
}
