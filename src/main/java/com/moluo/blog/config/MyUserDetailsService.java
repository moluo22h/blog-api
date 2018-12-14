//package com.moluo.blog.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
///**
// * @author zzh
// * @date 2018/12/6
// */
//
//@Component
//public class MyUserDetailsService implements UserDetailsService {
//
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        logger.info("用户名：" + username);
//        return new User(username, "123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//    }
//}
