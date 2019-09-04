package cn.kgc.controller;

import cn.kgc.pojo.Shop;
import cn.kgc.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
@CrossOrigin//跨域请求

@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopService shopService;
    //查询所有
    @RequestMapping("/findAll")
    public List<Shop> findAll(){
        List<Shop> shopList = shopService.findAll();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("shopList",shopList);
//        modelAndView.setViewName("mendian");
        return shopList;
    }

    //通过区域代号查询
    @RequestMapping("/findByqyDh")
    public List<Shop> findByqyDh(Integer qyDh){
        List<Shop> quList = shopService.findByQydh(qyDh);
        return quList;
    }
}
