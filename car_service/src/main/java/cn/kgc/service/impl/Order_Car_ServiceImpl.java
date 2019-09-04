package cn.kgc.service.impl;

import cn.kgc.dao.Order_Car_Dao;
import cn.kgc.pojo.Order_Car;
import cn.kgc.service.Order_Car_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Order_Car_ServiceImpl implements Order_Car_Service {
    @Autowired
    private Order_Car_Dao orderCarDao;
    @Override
    public List<Order_Car> findAll() {
      return orderCarDao.findAll();
    }

    @Override
    public List<Order_Car> finByid1(Integer order_type) {
        return orderCarDao.finByid1(order_type);
    }

    @Override
    public void del(Integer id) {
        orderCarDao.del(id);
    }

    @Override
    public Order_Car save(Order_Car orderCar) {
        return orderCarDao.save(orderCar);
    }

    @Override
    public List<Order_Car> findAll2() {
        return orderCarDao.findAll2();
    }


}
