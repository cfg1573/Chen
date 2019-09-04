package cn.kgc.controller;

import cn.kgc.pojo.CarComment;
import cn.kgc.service.CarCommentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @author Lizhenye
 * @date 2019/8/26  11:21
 */
@Controller
@RequestMapping("carComment")
public class CarCommentController {
    @Autowired
    CarCommentService carCommentService;
    ModelAndView mv = new ModelAndView();

    //写一个使用分页
    @RequestMapping("/findAll")
    public ModelAndView findCarComment(@RequestParam(name = "page",required = true,defaultValue = "1") int page,@RequestParam(name = "size",required = true,defaultValue = "5") int size) {

        List<CarComment> commentList = carCommentService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(commentList);
//        System.out.println(commentList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("Evaluation-list");
        return mv;
    }

    //表单数据后面的一个一个删除
    @RequestMapping("/delById")
    public String delCarComment(Integer cid) {
        System.out.println(cid);
        System.out.println("正在删除");
        carCommentService.del_CarComment(cid);
        System.out.println("已经删除");
        return "redirect:findAll";
    }
    //表单数据多选删除
    @RequestMapping("/delByIds")
    public String delCarComment(Integer[] cid) {
        System.out.println(cid);
        System.out.println("正在删除");
        for (Integer id:cid) {
            System.out.println(id);
            carCommentService.del_CarComment(id);
        }
        System.out.println("已经删除");
        return "redirect:findAll";
    }

    /**
     * 标记多选的修改状态
     * @param
     * @return
     */
    @RequestMapping("/update_ByIds")
    public String update_CarComments(HttpServletRequest request) {


        System.out.println(request.getParameter("id"));
//        for (Integer c : cid) {
//            System.out.println(c);
//            carCommentService.update_CarComments(c);
//        }
        return "redirect:findAll";
    }


    /**
     * 根据id查看详情，用于回写数据
     * @param cid
     * @return
     */
    @RequestMapping("/replyById")
    public ModelAndView replyById(Integer cid) {
        CarComment carComment = carCommentService.replyById(cid);
        mv.addObject("carComment",carComment);
        mv.setViewName("Evaluation-setup");
        return mv;
    }

    //刷单 多个添加
    @RequestMapping("/save")
    public String fileUploadToSpringMVC(HttpServletRequest request, CarComment carComment) throws Exception {
//        添加评论
//        首先获取到要下载那个位置
//        String path = request.getSession().getServletContext().getRealPath("/uploads/");
//        String paths = request.getSession().getServletContext().getRealPath("/");
////            第一次把最末未的取消
//            int index4=paths.lastIndexOf("\\");
//            String substring = paths.substring(0,index4);
////              第二次取消
//            int i = substring.lastIndexOf("\\");
//             substring = paths.substring(0,i);
////            取消第三期
//        int i1 = substring.lastIndexOf("\\");
//       String  user_images = paths.substring(0,i1);
//
//        String path = user_images+"\\src\\main\\webapp\\uploadfile";
//
//        File file = new File(path);
//        if (file.exists() != true) {
//            file.mkdirs();
//        }
////        获取文件的名字
//        String filename = upload.getOriginalFilename();
//        String uuid = UUID.randomUUID().toString().replace("-", "");
//        filename = uuid + "_" + filename;
////         然后上传文件
//        upload.transferTo(new File(path,filename));
//        ModelAndView modelAndView = new ModelAndView();
//        //写一个存进数据库的字符串
//        String imgname="\\uploadfile\\"+filename+ ".jpg";
//        获取日期
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd").format(date);
        int nums = Integer.parseInt(request.getParameter("nums"));
        carComment.setDate(format);
        carComment.setscalping("刷单");


        //定义一个数组储存评论的内容
        String[] userEvaluation = {"这家做的真好，我十分喜欢","服务周到，十分的方便","里面的帅哥美女服务十分友好，下次还来"
                ,"好评","我给他们一个大大的赞","助我一臂之力，十分棒。下次还回来的","老朋友介绍过来的，十分的棒。下次还来","老板生意兴隆",
                "操作快方便，大家都可以试试"};
        System.out.println("获取新的名字:"+carComment);
        for (int i=0;i<nums;i++) {
            //写一个随机生成的帐号
            Random random = new Random();
            //随机生成手机前三位
            int i1 = random.nextInt(99) + 100;
            //随机生成手机后四位
            int i2 = random.nextInt(999) + 1000;
            String username = i1 + "****" + i2;
            carComment.setUsername(username);
//            这个适用于读取图片的
            int urlname = random.nextInt(8) + 1;
            carComment.setUser_Headportrait("/img/user" + urlname + "-128x128.jpg");
            carComment.setUserEvaluation(userEvaluation[urlname]);
            System.out.println(carComment);
            carCommentService.inser_CarComment(carComment);
        }
        //重新跳转查看评论
        return "redirect:findAll";


    }







//
//    //自定义好一个user方便测试
//    @RequestMapping("/byUser")
//    public ModelAndView findUserByid(HttpServletResponse response, HttpServletRequest request) {
//
//        HttpSession session = request.getSession();
//        Users user = new Users("小李","/img/user1-128x128.jpg",1);
//        session.setAttribute("user",user);
//        mv.addObject("user", user);
//        mv.setViewName("demo");
//        return mv;
//    }

}
