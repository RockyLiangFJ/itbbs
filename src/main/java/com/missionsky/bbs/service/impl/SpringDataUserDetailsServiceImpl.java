package com.missionsky.bbs.service.impl;



import com.missionsky.bbs.dao.mapper.UserMapper;
import com.missionsky.bbs.dto.LoginRequest;
import com.missionsky.bbs.service.SpringDataUserDetailsService;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class SpringDataUserDetailsServiceImpl implements SpringDataUserDetailsService {

    @Resource
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUserName(LoginRequest loginRequest) {
        LoginRequest LoginRequest = userMapper.getUser(loginRequest);

        if(LoginRequest == null){
            //如果用户差不到 null 由privoder抛出异常
            return null;
        }

        UserDetails userDetails = User.withUsername(LoginRequest.getUserName()).password(LoginRequest.getPassword()).authorities("/register").build();
        return userDetails;
    }
}
