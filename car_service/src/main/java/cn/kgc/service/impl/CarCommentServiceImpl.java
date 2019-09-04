package cn.kgc.service.impl;

import cn.kgc.dao.CarCommentDao;
import cn.kgc.pojo.CarComment;
import cn.kgc.service.CarCommentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Lizhenye
 * @date 2019/8/27  11:03
 */
@Service
public class CarCommentServiceImpl implements CarCommentService {
    @Autowired
    CarCommentDao carCommentDao;

    /**
     * 查询出所有用户的评论的列表
     * @return
     */
    public List<CarComment> findAll(int page,int size) {
        //添加分页
        PageHelper.startPage(page, size);
        return carCommentDao.findAll();
    }

    /**
     * 添加评论
     * @param carComment
     */
    @Override
    public void inser_CarComment( CarComment carComment) {
         carCommentDao.inser_CarComment(carComment);
    }

    /***
     * 根据id删除
     * @param cid
     */
    @Override
    public void del_CarComment(Integer cid) {
        carCommentDao.del_CarComment(cid);
    }

    /**
     * 根据id查询，用于回写数据
     * @param cid
     * @return
     */
    @Override
    public CarComment replyById(Integer cid) {
     return    carCommentDao.replyById(cid);
    }

    /**
     * 修改多个状态 互相切换
     * @param cid
     */
    @Override
    public void update_CarComments(Integer cid) {

            carCommentDao.update_CarComment(cid);

    }


    /**
     * 用户品评论
     * @param carComment
     */

}
