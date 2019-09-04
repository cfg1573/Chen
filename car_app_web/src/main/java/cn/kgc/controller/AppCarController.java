package cn.kgc.controller;

import cn.kgc.pojo.Car;
import cn.kgc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;


/**
 * @author liurui
 * @date $ {DATE} 16:54
 */
@RestController
@CrossOrigin
@Controller
@RequestMapping("/app")
public class AppCarController {
    @Autowired
    private CarService carService;
    /**
     * 展示所有车辆数据
     * @return
     */
    @RequestMapping("/findAllCar")
    public List<Car> findAllCar(){
//        ModelAndView mv = new ModelAndView();
        List<Car> carList=carService.findAllCar();
//        mv.addObject("carList",carList);
//        mv.setViewName("shping");
        System.out.println(carList);
        return carList;
    }

    /**
     * 根据id查询到车辆信息，然后会回显到车辆详情
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public Car findById(Integer id){
        System.out.println(id);
//        ModelAndView mv = new ModelAndView();
        Car car = carService.findById(id);
//        List<Car> car = carService.findByIdCar(id);
//        System.out.println("car:::___"+car);
//        mv.addObject("car",car);
//        mv.setViewName("xiangqing");
        System.out.println("car"+car);
        return car;
    }



    /**
     * 根据车辆类型选择车辆
     * @param carType
     * @return
     */
    @RequestMapping("/findByCarType")
    public List<Car> findByCarType(Integer carType){
//        ModelAndView mv = new ModelAndView();
        List<Car> carList=carService.findByCarType(carType);
//        mv.addObject("carList",carList);
//        mv.setViewName("shping");
        return carList;
    }

}
