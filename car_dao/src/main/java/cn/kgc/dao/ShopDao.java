package cn.kgc.dao;

import cn.kgc.pojo.Shop;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopDao {
    @Select("select * from shop")
    List<Shop> findAll();

    @Select("select * from shop where qyDh=#{qyDh}")
    List<Shop> findByQydh(Integer qyDh);
}
