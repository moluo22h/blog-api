package com.moluo.blog.service;

import com.moluo.blog.domain.User;
import com.moluo.blog.exception.BlogError;
import com.moluo.blog.exception.BlogException;
import com.moluo.blog.repository.UserRepository;
import com.moluo.blog.utils.MyBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zzh
 * @date 2018/12/5
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(String id) {
        Optional<User> optional = userRepository.findById(id);
        if (!optional.isPresent()) {
            throw new BlogException(BlogError.user_id_not_exist);
        }
        return optional.get();
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User oldUser=getUser(user.getId());
        MyBeanUtils.copyNoNullProperties(user,oldUser);
        return userRepository.save(oldUser);
    }
}
