package cn.kgc.service.impl;

import cn.kgc.dao.UserDao;
import cn.kgc.pojo.User;
import cn.kgc.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findByid(Integer uid) {
        return userDao.findByid(uid);
    }

    @Override
    public void delByid(Integer uid) {
         userDao.delByid(uid);
    }

    @Override
    public User findByidUI(Integer uid) {
        return userDao.findByidUI(uid);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public List<User> findAll(int page, int size) {
        PageHelper.startPage(page, size);
        return userDao.findAll( );
    }
    //查id 和地址
    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }




}
