package cn.kgc.controller;

import cn.kgc.pojo.User;
import cn.kgc.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
//    查询所有
    public ModelAndView findAll(@RequestParam(name="page",required = true,defaultValue = "1")int page,
                                @RequestParam(name="size",required = true,defaultValue = "4")int size
    ){
        ModelAndView mv = new ModelAndView();
        List<User>List=userService.findAll(page,size);
        PageInfo userList = new PageInfo(List);
        mv.addObject("userList",userList);
        System.out.println(userList);
        mv.setViewName("user-list");
        return mv;
    }



    @RequestMapping("/save")
    public String upload(String username, MultipartFile upload, HttpServletRequest request,User user){
        String a = request.getParameter("name");
        System.out.println(a);
        System.out.println(username);
         System.out.println(user);
// 1 目标路径
        String realPath ="E:\\解压文件\\Car_rental\\Car_rental\\car_web\\src\\main\\webapp\\img";
        System.out.println(realPath);
// 2 判断该路径是否存在
        File realFile = new File(realPath);
        if(!realFile.exists()){
            realFile.mkdirs();
        }
        //       获取文件名
        String filename = upload.getOriginalFilename();
        System.out.println("fiename::::"+filename);
        System.out.println(filename);
        try {
            upload.transferTo(new File(realFile,filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        userService.save(user);
        return "redirect:/user/findAll";

    }

    @RequestMapping("/findByid")
//     根据id查询显示所有
    public ModelAndView findByid(Integer uid){
        ModelAndView mv = new ModelAndView();
        User user = userService.findByid(uid);
        mv.addObject("user",user);
        System.out.println(user);
        mv.setViewName("user-show");
        return mv;
    }


    @RequestMapping("/delByid")
//    保存
    public String delByid(Integer uid ){
        userService.delByid(uid);
        return "redirect:/user/findAll";
    }


    @RequestMapping("/findByidUI")
//     根据id查询显示所有
    public ModelAndView findByidUI(Integer uid){
        ModelAndView mv = new ModelAndView();
        User user = userService.findByidUI(uid);
        mv.addObject("user",user);
//        System.out.println(user);
        mv.setViewName("user-update");
        return mv;
    }



    @RequestMapping("/update")
//    修改
    public String update(User user){
        userService.update(user);
//        System.out.println("要修改的id"+user);
        return "redirect:/user/findAll";
    }



}
