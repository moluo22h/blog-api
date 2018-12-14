package com.moluo.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzh
 * @date 2018/11/6
 */
@EnableJpaAuditing
@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/hello")
    private String hello(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


}
