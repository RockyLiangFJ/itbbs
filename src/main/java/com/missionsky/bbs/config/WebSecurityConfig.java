package com.missionsky.bbs.config;

import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author Administrator
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 定义用户信息服务
     * @return
     */
    @Override
    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin").password("123456").authorities("/register").build());
        manager.createUser(User.withUsername("rocky").password("123456").authorities("/register").build());
        return manager;
    }


    /**
     *
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){return NoOpPasswordEncoder.getInstance();}


    /**
     * 安全拦截
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/bbs/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin()//
                    .loginPage("/login-view")
                    .loginProcessingUrl("/tlogin")
                    .successForwardUrl("/index")
                    .successForwardUrl("/index")
                    .permitAll();

    }
}
