package cn.kgc.service;

import cn.kgc.pojo.CarComment;

import java.util.List;

/**
 * @author Lizhenye
 * @date 2019/8/27  11:02
 */
public interface CarCommentService {

    //    写一个查询所有的评论 分页
    List<CarComment> findAll(int page, int size);

    //写一个管理员刷单评价
    void inser_CarComment(CarComment carComment);


    //删除评论
    void del_CarComment(Integer cid);


    //根据id查询详情
    CarComment replyById(Integer cid);

    //根据修改状态多选

    void update_CarComments(Integer cid);

}
