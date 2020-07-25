package com.missionsky.bbs.service;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.missionsky.bbs.dao.entity.User;
import com.missionsky.bbs.dto.LoginRequest;

/**
 * @author Administrator
 */
public interface UserService {
    User selUserNameAndPwd(Wrapper<User> user);


}
