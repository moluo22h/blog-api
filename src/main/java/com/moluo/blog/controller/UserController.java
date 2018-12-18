package com.moluo.blog.controller;

import com.moluo.blog.domain.User;
import com.moluo.blog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zzh
 * @date 2018/11/6
 */

@Api(value = "user", description = "用户模块")
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取当前用户认证信息", notes = "获取当前用户认证信息")
    @GetMapping("/me")
    public Object getCurrentUser(@AuthenticationPrincipal UserDetails user) {
        return user;
    }

    @ApiOperation(value = "添加一个用户", notes = "添加一个用户")
    @PostMapping()
    User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @ApiOperation(value = "删除一个用户", notes = "根据指定用户id，删除一个用户")
    @DeleteMapping(path = "/{id}")
    void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @ApiOperation(value = "获取一个用户", notes = "通过指定用户id，获取一个用户")
    @GetMapping(path = "/{id}")
    User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @ApiOperation(value = "获取所有用户", notes = "获取所有用户")
    @GetMapping
    List<User> listUsers() {
        return userService.listUsers();
    }

    @ApiOperation(value = "更新一个用户", notes = "更新一个用户的信息")
    @PutMapping
    User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
