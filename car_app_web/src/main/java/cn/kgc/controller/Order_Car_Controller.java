package cn.kgc.controller;

import cn.kgc.pojo.Order_Car;
import cn.kgc.service.impl.Order_Car_ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin
@Controller
@RequestMapping("/car")
public class Order_Car_Controller {
    @Autowired
    private Order_Car_ServiceImpl orderCarService;
//查询所有
    @RequestMapping("/findAll")
    public List<Order_Car> findAll(){
        List<Order_Car> list = orderCarService.findAll();
//        for (Order_Car order_car : list) {
//            order_car.setImage("http://172.25.7.152:8080/imgs/001.png");
//        }
        System.out.println(list);
        return list;
    }


//    @RequestMapping("/findAll")
//    public List<Order_Car> findAll(){
//        List<Order_Car> list = orderCarService.findAll();
//        for (Order_Car order_car : list) {
//            order_car.setImage("http://172.25.7.152:8080/imgs/001.png");
//        }
//        return list;
//    }


//    根据id回显数据待付款
    @RequestMapping("/findByid1")
    public ModelAndView findByid1(Integer order_type){
        System.out.println(order_type);
        ModelAndView mv = new ModelAndView();
        List<Order_Car> list = orderCarService.finByid1(order_type);
//        System.out.println(list);
        mv.addObject("list",list);
        mv.setViewName("dingdanliebiao");
        return mv;
    }


//删除订单
    @RequestMapping("/del")
    private  String del(Integer id){
        orderCarService.del(id);
        return "redirect:/car/findAll";
    }





    //评论查询所有
    @RequestMapping("/findAll2")
    public ModelAndView findAll2(){
        ModelAndView mv = new ModelAndView();
        List<Order_Car> list = orderCarService.findAll2();
        mv.addObject("list",list);
        mv.setViewName("ping");
        return mv;
    }


    @RequestMapping("/save")
    public String upload( MultipartFile upload, HttpServletRequest request,Order_Car orderCar) throws IOException {
// 1 目标路径
        String realPath = "D:\\Car_rental_app\\car_app_web\\src\\main\\webapp\\imgs";
// 2 判断该路径是否存在
        File realFile = new File(realPath);
        if(!realFile.exists()){
            realFile.mkdirs();
        }
        //       获取文件名
        String filename = upload.getOriginalFilename();
//        上传到指定的路径下realPath  名字为filename
        upload.transferTo(new File(realPath, filename));

        String imgname = "/img/" + filename;
        System.out.println(imgname);
        orderCar.setImage(imgname);
        Order_Car save = orderCarService.save(orderCar);
        return "redirect:/car/findAll2";
    }

}
