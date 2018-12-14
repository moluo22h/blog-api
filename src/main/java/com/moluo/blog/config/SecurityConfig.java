//package com.moluo.blog.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
///**
// * 安全配置类
// *
// * @author zzh
// * @date 2018/12/5
// */
////@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Bean
//    public static NoOpPasswordEncoder passwordEncoder() {
//        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        super.configure(http);
//        http.authorizeRequests()
////                .antMatchers("/css/**", "/js/**", "/fonts/**", "/index").permitAll()//都可以访问
//                .antMatchers("/hello/**").hasRole("ADMIN")//需要相应角色才能访问
////                .anyRequest().authenticated()
//                .and()
//                .formLogin()//基于Form表单登录验证
////                .loginPage("/login").failureUrl("/login-error");//自定义登录界面
//                .and()
//                .httpBasic();
//    }
//
//    /**
//     * 认证信息管理
//     *
//     * @param auth
//     * @throws Exception
//     */
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
////                .passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("zzh")
//                .password("123456")
//                .roles("ADMIN");
//    }
//}
