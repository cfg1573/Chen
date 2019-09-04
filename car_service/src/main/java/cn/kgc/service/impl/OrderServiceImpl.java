package cn.kgc.service.impl;

import cn.kgc.Orders;
import cn.kgc.dao.OrderDao;
import cn.kgc.service.OrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;
//    @Override
//    public List<Orders> findAll() {
//        return adminDao.findAll();
//    }

    @Override
    public void save(Orders orders) {
        orderDao.save(orders);
    }

    @Override
    public Orders findById(Integer oid) {
        return orderDao.findById(oid);
    }

    @Override
    public void update(Orders orders) {
        orderDao.update(orders);
    }

    @Override
    public void delOne(Integer oid) {
        orderDao.delOne(oid);
    }
    //删除多个
    @Override
    public void delMany(Integer[] oids) {
        if (oids!=null){
            for (Integer oid:oids){
                orderDao.delOne(oid);
            }
        }
    }

    //分页助手
    @Override
    public List<Orders> findAll(int page, int size) {
        //指定分页参数
        PageHelper.startPage(page,size);
        return orderDao.findAll();
    }
}
