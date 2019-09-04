<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<link rel="stylesheet" href="../css/denglu.css">

<body>
    <div class="hear">
        <img src="../imgs/denglu/denglulogo@2x.png" alt="">
    </div>
    <div class="pho">
        <img src="../imgs/denglu/dengluicon-01@2x.png" alt="">
        <input type="text" placeholder="请输入邮箱号">
    </div>
    <div class="yanzheng">
        <img src="../imgs/denglu/dengluicon-02@2x.png" alt="">
        <input type="text" placeholder="验证码">
        <input type="button" value="获取验证码">
        <span></span>
    </div>
    <div class="btn">
        <a>
            <p class="wtn">登录/注册</p>
        </a>
    </div>
    <div class="tishi">
        <p>您输入的邮箱或验证码有误</p>
    </div>

    <p class="logo">
        第三方登录
    </p>
    <div class="thlogo">
        <img src="../imgs/denglu/denglu微信@2x.png" alt="">
        <img src="../imgs/denglu/denglu微博@2x.png" alt="">
        <img src="../imgs/denglu/dengluqq@2x.png" alt="">
    </div>


</body>
<script src="../js/zepto.min.js"></script>
<script src="../js/touch.js"></script>
<!--<script src="../js/fontsize.js"></script>-->
<script>
    function setrem() {
        var windowwidth = window.innerWidth;
        var newpx = (windowwidth / 750) * 100;
        $('html').css('fontSize', newpx);
    }
    setrem();
    window.onresize = function () {
        setrem();
    };



    var reg = new RegExp("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$");
    $(".pho>input").on("blur", function () {
        // console.log($(".pho>input").val())
        if (reg.test($(".pho>input").val())) {
            $(".pho>input").css("color", "rgb(153,153,153)");
        } else {
            $(".pho>input").css("color", "red");
        }
    })




    var timer = null;
    function sendemail(obj) {
        // var obj = $("#btn");
        settime(obj);
    }


    var countdown = 60;
    function settime(obj) {

        if (countdown == 0) {
            obj.attr('disabled', "false");
            obj.val("获取验证码");
            obj.css('background', "rgb(241,241,241)")
            $(".yanzheng>span:nth-child(4)").removeClass("add");
            countdown = 60;
            return;
        } else {
            obj.attr('disabled', "true");
            countdown--;
            obj.val("重新发送(" + countdown + ")");
            obj.css('background', "rgba(241,241,241,.7)")
            $(".yanzheng>span:nth-child(4)").addClass("add");

        }


        clearTimeout(timer);
        timer = setTimeout(function () {
            settime(obj);
        }, 1000);
    }


    $('.yanzheng>input:nth-child(3)').on("tap", function () {
        settime($('.yanzheng>input:nth-child(3)'))
    })




    var reg1 = /^\d{4}$/;
    $(".yanzheng>input:nth-child(2)").on("blur", function () {
        if (reg1.test($(".yanzheng>input:nth-child(2)").val())) {
            $(".yanzheng>input:nth-child(2)").css("color", "rgb(153,153,153)");
        } else {
            $(".yanzheng>input:nth-child(2)").css("color", "red");
        }
    })


    $(".btn>a>p").on("tap", function () {
        if (reg.test($(".pho>input").val())===true && reg1.test($(".yanzheng>input:nth-child(2)").val())===true) {
            window.location="index.html";
        }else{
            $(".tishi>p").css("display","block");
        }

    })

</script>

</html>