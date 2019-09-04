<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
    <link rel="stylesheet" href="../css/my.css">
</head>
<body>
<div class="my">
<div class="header">
    <img src="../imgs/dmz.jpg" alt="">
    <p>董明珠</p>
    <p>188****8888</p>
</div>
    <div class="liebiao">
        <div class="qs">
            <div class="qs1">
                <img src="../imgs/h'%20(1).png" alt="">
                <p class="qa">我的钱包</p>
            </div>
            <img src="../imgs/h'%20(9).png" alt="">
        </div>
        <div class="qs">
            <div class="qs1">
                <img src="../imgs/h'%20(2).png" alt="">
                <p>我的订单</p>
            </div>
            <img src="../imgs/h'%20(10).png" alt="">
        </div>
        <div class="qs">
            <div class="qs1">
                <img src="../imgs/h'%20(3).png" alt="">
                <p>发票</p>
            </div>
            <img src="../imgs/h'%20(10).png" alt="">
        </div>
        <div class="qs">
            <div class="qs1">
                <img src="../imgs/h'%20(4).png" alt="">
                <p>违章</p>
            </div>
            <img src="../imgs/h'%20(10).png" alt="">
        </div>
        <div class="qs">
            <div class="qs1">
                <img src="../imgs/h'%20(5).png" alt="">
                <p>用户反馈</p>
            </div>
            <img src="../imgs/h'%20(10).png" alt="">
        </div>
        <div class="qs">
            <div class="qs1">
                <img src="../imgs/h'%20(6).png" alt="">
                <p>帮助中心</p>
            </div>
            <img src="../imgs/h'%20(10).png" alt="">
        </div>
        <div class="qs">
            <div class="qs1">
                <img src="../imgs/h'%20(7).png" alt="">
                <p>设置</p>
            </div>
            <img src="../imgs/h'%20(10).png" alt="">
        </div>
        <div class="qs">
            <div class="qs1">
                <img src="../imgs/h'%20(8).png" alt="">
                <p>版权检测</p>
            </div>
            <img src="../imgs/h'%20(10).png" alt="">
        </div>
    </div>
</div>
</body>
<script src="../js/zepto.min.js"></script>
<script src="../js/swiper.js"></script>
<script src="../js/vue.js"></script>
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

</script>
</html>