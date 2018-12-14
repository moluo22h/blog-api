//package com.moluo.blog.repository;
//
//import com.moluo.blog.domain.User;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.ConcurrentMap;
//import java.util.concurrent.atomic.AtomicLong;
//
///**
// * @author zzh
// * @date 2018/11/6
// */
//public class UserRespositoryImpl implements UserRepository {
//
//    private static AtomicLong counter = new AtomicLong();
//
//    private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<>();
//
//    @Override
//    public User insertUser(User user) {
//        Long id = user.getId();
//        if (id == null) {
//            id = counter.incrementAndGet();
//            user.setId(id);
//        }
//        return this.userMap.put(id, user);
//    }
//
//    @Override
//    public void deleteUser(Long id) {
//        this.userMap.remove(id);
//    }
//
//    @Override
//    public void updateUser(User user) {
//
//
//    }
//
//    @Override
//    public User getUser(Long id) {
//        return this.userMap.get(id);
//    }
//
//    @Override
//    public List<User> listUsers() {
//        return new ArrayList<User>(this.userMap.values());
//    }
//}
