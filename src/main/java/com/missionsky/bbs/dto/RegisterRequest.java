package com.missionsky.bbs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "notBlank")
    private String userName;

    @NotEmpty(message = "notEmpty")
    private String password;

    @NotBlank(message = "notBlank")
    private String verifyCode;

    private String rememberMe;
}
