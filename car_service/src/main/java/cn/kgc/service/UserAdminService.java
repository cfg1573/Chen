package cn.kgc.service;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author liurui
 * @date $ {DATE} 15:30
 */
public interface UserAdminService extends UserDetailsService{
    void updatePas(String password);
}
