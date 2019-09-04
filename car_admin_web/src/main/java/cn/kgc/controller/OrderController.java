package cn.kgc.controller;

import cn.kgc.Orders;
import cn.kgc.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin_order")
public class OrderController {
    @Autowired
    OrderService orderService;
    //查询全部订单
    @RequestMapping("/findAll")
    public ModelAndView findAll(
            @RequestParam(value = "page",required = true,defaultValue = "1") int page,
            @RequestParam(value = "size",required = true,defaultValue = "2") int size
    ){
        ModelAndView modelAndView = new ModelAndView();
        List<Orders> ordersList  = orderService.findAll(page,size);
       //分页助手 pageInFo就是分页的bean
        PageInfo pageInfo = new PageInfo(ordersList);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("order-list");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Orders orders){
        orderService.save(orders);
        return "redirect:findAll";
    }
    //回显id
    @RequestMapping("/updateUI")
    public ModelAndView updateUI(Integer oid){
        System.out.println("回显："+oid);
        Orders orders = orderService.findById(oid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("orders",orders);
        modelAndView.setViewName("order-update");
        return modelAndView;
    }

    //修改数据
    @RequestMapping("/update")
    public String update(Orders orders){
        orderService.update(orders);
        return "redirect:findAll";
    }
    //删除
    @RequestMapping("/delOne")
    public String del(Integer oid){
        orderService.delOne(oid);
        return "redirect:findAll";
    }
    //删除多个
    @RequestMapping("/delMany")
    public String delMany(Integer[]oids){
        System.out.println("oids是：==="+oids);
        orderService.delMany(oids);
        return "redirect:findAll";
    }

}
