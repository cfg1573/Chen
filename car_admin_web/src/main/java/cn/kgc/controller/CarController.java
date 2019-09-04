package cn.kgc.controller;

import cn.kgc.pojo.Car;
import cn.kgc.service.CarService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @author liurui
 * @date $ {DATE} 17:41
 */
@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;
    /**
     * 车辆管理 查询全部
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(name = "currPage",required = false,defaultValue = "1")int currPage,
                                @RequestParam(name = "pageSize",required = false,defaultValue = "2")int pageSize){
        ModelAndView mv = new ModelAndView();
        PageInfo<Car> pageInfo=carService.findByPage(currPage,pageSize);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("car-list");
        return mv;
    }

    /**
     * 保存图片
     * @param request
     * @param upload
     * @param car
     * @return
     * @throws Exception
     */
    @RequestMapping("/fileUpload")
    public String fileUpload(HttpServletRequest request, MultipartFile upload, Car car) throws Exception {
        //首先获取到要下载那个位置
        String paths = request.getSession().getServletContext().getRealPath("/");
        //图片下载的绝对路径：D:\Users\Administrator\IdeaProjects\Car_Rental_Project\Car_rental\car_web\target\car_web\
         //首先获取最后一个\的索引然后从头开始切除最后部分
        System.out.println(paths+"___________________-asdfasdfasdfad123456789");
        int indexLast = paths.lastIndexOf("\\");
        String substring = paths.substring(0, indexLast);
        //D:\Users\Administrator\IdeaProjects\Car_Rental_Project\Car_rental\car_web\target\car_web
        //找到我们需要的部分一层层切除
        int indexLast1 = substring.lastIndexOf("\\");
        substring = paths.substring(0, indexLast1);
        System.out.println(substring+"___________________-asdfasdfasdfad123456789");
        //D:\Users\Administrator\IdeaProjects\Car_Rental_Project\Car_rental\car_web\target
        int indexLast2 = substring.lastIndexOf("\\");
        String car_images = paths.substring(0, indexLast2);
        //找到了我们的项目图片所在的路径
        System.out.println(car_images+"___________________-asdfasdfasdfad123456789");
        //D:\Users\Administrator\IdeaProjects\Car_Rental_Project\Car_rental\car_web然后拼接成图片的绝对路径
        String path = car_images + "\\src\\main\\webapp\\products";
        //D:\Users\Administrator\IdeaProjects\Car_Rental_Project\Car_rental\car_web\src\main\webapp\products
        //判断该路径是否存在，如果不存在那么新建一个
        File file = new File(path);
        if (file.exists() != true) {
            file.mkdirs();
        }
        //获取文件的名字
        String filename = upload.getOriginalFilename();
        System.out.println(filename+"___________________-asdfasdfasdfad123456789");
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        // 然后上传文件
        upload.transferTo(new File(path, filename));
        ModelAndView modelAndView = new ModelAndView();
        //写一个存进数据库的字符串
        String imgname = "products/" + filename;
        System.out.println(imgname+"___________________-asdfasdfasdfad123456789");
        car.setCarImg(imgname);
        carService.inser_img(car);
        //重新跳转查看评论
        return "redirect:findAll";
    }
//        /**
//         * 保存车辆信息
//         * @param car
//         * @return
//         */
//    @RequestMapping("/save.do")
//    public String save(Car car){
//        carService.save(car);
//        return "redirect:findAll.do";
//    }

    /**
     * 删除某一条数据
     * @return
     */
    @RequestMapping("/del")
    public String del(Integer id){
        carService.del(id);
        return "redirect:findAll";
    }

    /**
     * 因为要修改数据，我们要首先根据id找到该数据进行回显
     * @param id
     * @return
     */
    @RequestMapping("/updateHx")
    public ModelAndView updateHx(Integer id){
        ModelAndView mv = new ModelAndView();
        Car car=carService.findById(id);
        mv.addObject("car",car);
        mv.setViewName("car-update");
        return mv;
    }

//    /**
//     * 我们要根据车辆的id去添加图片，所以首先要回显下数据，方便我们知道我们添加图片的车辆没错
//     * @param id
//     * @return
//     */
//    @RequestMapping("/saveImg.do")
//    public ModelAndView saveImg(Integer id){
//        System.out.println("id:"+id);
//        ModelAndView mv = new ModelAndView();
//        Car car=carService.findById(id);
//        System.out.println("car：：："+car);
//        mv.addObject("car",car);
//        mv.setViewName("car-insertImg");
//        return mv;
//    }

    /**
     * 修改车辆信息数据
     * @param car
     * @return
     */
    @RequestMapping("/update")
    public  String update(Car car){
        carService.update(car);
        return "redirect:findAll";
    }

    /**
     * 删除多条数据
     * @param ids
     * @return
     */
    @RequestMapping("/delMany")
    public String delMany(Integer[]ids){
        carService.delMany(ids);
        return "redirect:findAll";
    }

    /**
     * 通过id查看该车辆的信息
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public ModelAndView findById(Integer id){
        ModelAndView mv = new ModelAndView();
        Car car = carService.findById(id);
        mv.addObject("car",car);
        mv.setViewName("car-show");
        return mv;
    }

    /**
     * 按钮排序
     */

    @RequestMapping("/findByIdJx")
    public ModelAndView findByIdJx(@RequestParam(name = "currPage",required = false,defaultValue = "1")int currPage,
                                   @RequestParam(name = "pageSize",required = false,defaultValue = "2")int pageSize){
        ModelAndView mv = new ModelAndView();
        PageInfo<Car> pageInfo=carService.findByIdJx(currPage,pageSize);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("car-list");
        return mv;
    }
}
