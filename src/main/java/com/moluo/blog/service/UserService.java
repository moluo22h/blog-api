package com.moluo.blog.service;

import com.moluo.blog.domain.User;

import java.util.List;

/**
 * @author zzh
 * @date 2018/12/5
 */
public interface UserService {

    User addUser(User user);

    void deleteUser(String id);

    User getUser(String id);

    List<User> listUsers();

    User updateUser(User user);
}
