package cn.kgc.dao;

import cn.kgc.pojo.Order_Car;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Order_Car_Dao {
//    查询所有
   @Select("select * from order_car")
   List<Order_Car> findAll();


//待付款
   @Select("select * from order_car where order_type=#{order_type}")
   List<Order_Car> finByid1(Integer order_type);

//按照id删除
   @Delete("delete from order_car where id=#{id}")
   void del(Integer id);


//   保存用户评论
   @Insert("insert into values (null,#{order_type},#{car_status},#{car_startShopName},#{order_status},#{car_image},#{car_name},#{from_car},#{to_car},#{image})")
   Order_Car save(Order_Car orderCar);


//   评论查询所有
@Select("select * from order_car")
   List<Order_Car> findAll2();
}
