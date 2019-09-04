package cn.kgc.dao;

import cn.kgc.pojo.UserAdmin;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author liurui
 * @date $ {DATE} 15:27
 */
@Repository
public interface UserAdminDao {
    /**
     * 查询登陆
     * @param username
     * @return
     */
    @Select("select * from user_admin where username=#{username}")
    UserAdmin findByUsername(String username);

    /**
     * 修改密码
     * @param password
     */
    @Update("update user_admin set password=#{password} where id=#{id}")
    void updatePas(String password);
}
