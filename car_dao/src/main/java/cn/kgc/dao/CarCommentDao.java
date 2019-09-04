package cn.kgc.dao;

import cn.kgc.pojo.CarComment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Lizhenye
 * @date 2019/8/26  10:24
 */
@Repository
public interface CarCommentDao {
    //    写一个查询所有的评论
    @Select("select * from carcomment")
    List<CarComment> findAll();

    //    //写一个用户刷单评论的功能
    @Insert("insert into carcomment values(null,#{username},#{userEvaluation},#{date},#{img_url},#{user_Headportrait},#{state},#{scalping})")
    void inser_CarComment(CarComment carComment);

    //写一个根据id删除功能的
    @Delete("delete  from carcomment where cid=#{cid}")
    void del_CarComment(Integer cid);


    //根据id查询一个评论
    @Select("select * from carcomment where cid=#{cid} ")
    CarComment replyById(Integer cid);

    //标记的 状态修改成已回复
    @Update("update carcomment set state='已回复' where cid=#{cid}")
    void update_CarComment(Integer cid);

}
