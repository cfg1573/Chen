package cn.kgc.service;

import cn.kgc.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> findAll();

    void save(User user);

    User findByid(Integer uid);

    void delByid(Integer uid);

    User findByidUI(Integer uid);

    void update(User user);

    List<User> findAll(int page, int size);
    //查id和地址
    User findByEmail(String email);
//    //根据email查
//    User findByEmail(String email);



}
