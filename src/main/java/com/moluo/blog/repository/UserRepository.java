package com.moluo.blog.repository;

import com.moluo.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zzh
 * @date 2018/11/6
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

//    User insertUser(User user);
//
//    void deleteUser(Long id);
//
//    void updateUser(User user);
//
//    User getUser(Long id);
//
//    List<User> listUsers();
}
