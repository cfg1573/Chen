package cn.kgc.service.impl;

import cn.kgc.dao.ShopDao;
import cn.kgc.pojo.Shop;
import cn.kgc.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopDao shopDao;
    @Override
    public List<Shop> findAll() {
        return shopDao.findAll();
    }
    //通过区域代号查询
    @Override
    public List<Shop> findByQydh(Integer qyDh) {
        return shopDao.findByQydh(qyDh);
    }
}
