package com.missionsky.bbs.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.missionsky.bbs.common.ResponseResult;
import com.missionsky.bbs.dao.entity.User;
import com.missionsky.bbs.dto.LoginRequest;
import com.missionsky.bbs.service.UserService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


/**
 * @author Administrator
 */
@RestController
public class LoginController{
    @Resource
    private UserService userService;


    /**
     * @Valid 开启对user对象的数据校验
     * @param loginRequest
     * @param result  封装了校验的结果
     * @param session
     * @return
     */
    @PostMapping("/tlogin")
    public ResponseResult tlogin(@Valid LoginRequest loginRequest, BindingResult result, HttpSession session, HttpServletResponse response){
        //如果校验有错误
        if(loginRequest ==null || result.hasErrors()){
            System.out.println(result.getAllErrors());
            return new ResponseResult(500,"null");
        }
        //获取session中的验证码
        Object verifyCodeSession = session.getAttribute("kaptcha");

        //如果验证码已失效
        if(verifyCodeSession == null){
            return new ResponseResult(500,"codeNull");
        }

        //输入的验证码不正确
        if(!loginRequest.getVerifyCode().equalsIgnoreCase(verifyCodeSession.toString())){
            return new ResponseResult(500,"notMatch");
        }

        User loginUser = null;
        try {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("user_name",loginRequest.getUserName());
            queryWrapper.eq("password",loginRequest.getPassword());
            loginUser = userService.selUserNameAndPwd(queryWrapper);
        }catch (Exception e){
            e.getStackTrace();
        }
        //登陆失败 用户名或密码错误
        if(loginUser == null){
            return new ResponseResult(500,"login");
        }

        session.setAttribute("loginUser",loginUser);

        if("on".equals(loginRequest.getRememberMe())){
            //创建一个键值对的cookie对象
            Cookie cookie = new Cookie("loginUser",loginUser.getUserName());
            //设置cookie的生命周期7天
            cookie.setMaxAge(60*60*24*7);
            response.addCookie(cookie);
        }
        return new ResponseResult(1,"success");
    }



}