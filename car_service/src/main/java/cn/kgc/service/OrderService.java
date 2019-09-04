package cn.kgc.service;

import cn.kgc.Orders;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderService {
    //查询所有
//    List<Orders> findAll();
    //添加
    void save(Orders orders);
    //回显
    Orders findById(Integer oid);

    //更改
    void update(Orders orders);
    //删除
    void delOne(Integer oid);
    //删除多个
    void delMany(Integer[] oids);
    //分页查所有
    List<Orders> findAll(int page, int size);
}
