package cn.kgc.controller;
import cn.kgc.pojo.User;
import cn.kgc.service.UserService;
import cn.kgc.utils.RandomUtils;
import cn.kgc.utils.SendMailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/sendEmail")
    public String sendEmail(@RequestParam("emailAddress")String emailAddress){
        User byEmail = userService.findByEmail(emailAddress);
        if (byEmail==null){
            System.out.println("emailAddress"+emailAddress);
            //生成验证码
            String verifyCode = RandomUtils.code();

            //把邮箱保存到数据库中
            User user = new User();
            user.setEmail(emailAddress);
            userService.save(user);

            System.out.println("验证码:"+verifyCode);

            //邮箱主题
            String emailTitle = "邮箱验证";
            //邮箱内容
            String emailCount ="您正在进行邮箱验证，给您整了个验证码：" + verifyCode + "，别瞅了，赶紧验证去，就五分钟";
            //发送邮件
            try {
                SendMailUtil.sendEmail(emailAddress, emailTitle, emailCount);
                System.out.println("邮件发送成功！");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return verifyCode;
        }else {
            //生成验证码
            String verifyCode = RandomUtils.code();
            System.out.println("验证码:"+verifyCode);

            //邮箱主题
            String emailTitle = "邮箱验证";
            //邮箱内容
            String emailCount ="您正在进行邮箱验证，给您整了个验证码：" + verifyCode + "，别瞅了，赶紧验证去，就五分钟";
            //发送邮件
            try {
                SendMailUtil.sendEmail(emailAddress, emailTitle, emailCount);
                System.out.println("邮件发送成功！");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return verifyCode;

        }

    }

    //判断邮箱和验证码
    @RequestMapping("/findByEmail")
    public Boolean findByEmail(String email){
        System.out.println(email);
       User users= userService.findByEmail(email);
       if (users!=null){
           return true;
       }else {
           return false;
       }

    }






}
