package cn.kgc.service.impl;

import cn.kgc.dao.UserAdminDao;
import cn.kgc.pojo.UserAdmin;
import cn.kgc.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author liurui
 * @date $ {DATE} 15:31
 */
@Service("userService")
public class UserAdminServiceImpl implements UserAdminService {
    @Autowired
    private UserAdminDao userdao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //通过用户名获取对象
        UserAdmin userAdmin=userdao.findByUsername(username);
        if(userAdmin!=null){
            Collection<GrantedAuthority> auther=new ArrayList<>();
            SimpleGrantedAuthority role_user = new SimpleGrantedAuthority("ROLE_USER");
            auther.add(role_user);
            // 1 用户名   2 密码   角色列表对象
            UserDetails user = new User(userAdmin.getUsername(), "{noop}" + userAdmin.getPassword(), auther);
            return user;
        }

        return null;
    }

    @Override
    public void updatePas(String password) {
        userdao.updatePas(password);
    }
}
