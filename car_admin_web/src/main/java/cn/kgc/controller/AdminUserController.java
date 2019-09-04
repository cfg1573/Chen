package cn.kgc.controller;

import cn.kgc.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liurui
 * @date $ {DATE} 14:49
 */
@Controller
@RequestMapping("/adminUser")
public class AdminUserController {
    @Autowired
    private UserAdminService userAdminService;
    @RequestMapping("/updatePassword.do")
    public String updatePassword(String password){
        userAdminService.updatePas(password);
        return "index";
    }
//    public ModelAndView
}
