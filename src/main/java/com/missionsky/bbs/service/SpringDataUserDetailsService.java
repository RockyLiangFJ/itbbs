package com.missionsky.bbs.service;

import com.missionsky.bbs.dto.LoginRequest;
import org.springframework.security.core.userdetails.UserDetails;

public interface SpringDataUserDetailsService {
    UserDetails loadUserByUserName(LoginRequest loginRequest);
}
