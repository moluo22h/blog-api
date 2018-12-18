package com.moluo.blog.config;

import com.moluo.blog.config.properties.SecurityProperties;
import com.moluo.blog.config.validatecode.ValidateCodeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * 安全配置类
 *
 * @author zzh
 * @date 2018/12/5
 */
//@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    private AuthenticationSuccessHandler blogAuthenticationSuccessHandler;

    @Autowired
    private AuthenticationFailureHandler blogAuthenticationFailureHandler;

//    @Bean
//    public static NoOpPasswordEncoder passwordEncoder() {
//        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        ValidateCodeFilter validateCodeFilter = new ValidateCodeFilter();
        validateCodeFilter.setAuthenticationFailureHandler(blogAuthenticationFailureHandler);

        http.addFilterBefore(validateCodeFilter,UsernamePasswordAuthenticationFilter.class)
                .formLogin()
                .loginPage("/authentication/request")
                .loginProcessingUrl("/authentication/form")
                .successHandler(blogAuthenticationSuccessHandler)
                .failureHandler(blogAuthenticationFailureHandler)
//        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/authentication/request",
                        securityProperties.getBrowser().getLoginPage(),"/code/image").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
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
    }

    /**
     * 认证信息管理
     *
     * @param auth
     * @throws Exception
     */
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
////                .passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("zzh")
//                .password("123456")
//                .roles("ADMIN");
//    }
}
