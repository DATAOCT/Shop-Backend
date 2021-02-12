package com.dataoct.onlineshop.vo.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created By Dataoct Team on 1/1/2019.
 */
@Data
public class LoginForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
