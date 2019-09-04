package cn.kgc.service;

import cn.kgc.pojo.Shop;

import java.util.List;

public interface ShopService {

    List<Shop> findAll();

    List<Shop> findByQydh(Integer qyDh);
}
