package com.moluo.blog.config.validatecode;

import org.springframework.security.core.AuthenticationException;

/**
 * @author zzh
 * @date 2018/12/18
 */
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
