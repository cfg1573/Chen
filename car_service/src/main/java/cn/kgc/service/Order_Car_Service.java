package cn.kgc.service;

import cn.kgc.pojo.Order_Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Order_Car_Service {


    List<Order_Car> findAll();

    List<Order_Car> finByid1(Integer order_type);

    void del(Integer id);


    Order_Car save(Order_Car orderCar);

    List<Order_Car> findAll2();
}
