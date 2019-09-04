package cn.kgc.dao;

import cn.kgc.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
//   查询所有
@Select("select * from users")
    List<User> findAll();


//保存
@Insert("insert into users values(null,#{email},null,null,null,null,null,null,0,0)")
    void save(User user);


//根据id查询
@Select("select *from users where uid=#{uid}")
    User findByid(Integer uid);



//根据id删除
@Delete("delete from users where uid=#{uid}")
    void delByid(Integer uid);



//    根据id回显数据
@Select("select *from users where uid=#{uid}")
    User findByidUI(Integer uid);



@Update("update users set email=#{email},telephone=#{telephone},code=#{code},name=#{name},address=#{address},cityName=#{cityName},user_image=#{user_image},money=#{money},member=#{member} where uid=#{uid}")
    void update(User user);

//根据email查 看数据库是否有
    @Select("select * from users where email=#{email}")
    User findBuEmail(String email);
//根据邮箱查
    @Select("select * from users where email=#{email}")
    User findByEmail(String email);
}
