package com.moluo.blog.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 自定义密码加密解码逻辑
 * @author zzh
 * @date 2018/12/17
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}
