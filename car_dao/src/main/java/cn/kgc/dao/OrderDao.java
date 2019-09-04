package cn.kgc.dao;

import cn.kgc.Orders;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

    //查询所有
    @Select("select * from orders")
    public List<Orders> findAll();
    //添加
    @Insert("insert into orders values(null,#{cityStrName},#{cityOverName},#{startTime},#{closeTime},#{orderStarus},#{money},#{orderNum},#{startShopName},#{overShopName},#{days})")
    void save(Orders orders);
    //回显
    @Select("select * from orders where oid=#{id}")
    Orders findById(Integer oid);
    //更改
    @Update("update orders set cityStrName=#{cityStrName},cityOverName=#{cityOverName},startTime=#{startTime},closeTime=#{closeTime},orderStarus=#{orderStarus},money=#{money},orderNum=#{orderNum},startShopName=#{startShopName},overShopName=#{overShopName},days=#{days} where oid=#{oid}")
    void update(Orders orders);
    //根据id删除
    @Delete("delete from orders where oid=#{oid}")
    void delOne(Integer oid);
}
