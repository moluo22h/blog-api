package com.moluo.blog.service;

import com.moluo.blog.domain.User;
import com.moluo.blog.repository.UserRepository;
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
//        Date date=new Date();
//        user.setCreateTime(date);
//        user.setUpdateTime(date);
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
            return null;
        }
        return optional.get();
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
//        Optional<User> optional=userRepository.findById(user.getId());
//        if (!optional.isPresent()){
//          return user;
//        }
//        User oldUser=optional.get();
//        BeanUtils.copyProperties(user,oldUser);
        return userRepository.save(user);
    }
}
