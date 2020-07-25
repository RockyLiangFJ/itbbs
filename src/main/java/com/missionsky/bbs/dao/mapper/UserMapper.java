package com.missionsky.bbs.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.missionsky.bbs.dao.entity.User;
import com.missionsky.bbs.dto.LoginRequest;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author Administrator
 */
@Mapper
public interface UserMapper  extends BaseMapper<User> {
    LoginRequest getUser(LoginRequest loginRequest);
}
