<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>评论</title>
    <link rel="stylesheet" href="../css/pinglun.css">
</head>
<body>
<div class="pinglun">
    <div class="header">
        <a href="/dingdanliebiao.jsp"><img src="../imgs/jiantou.png" alt=""></a>
        <p>评论列表</p>
        <a href="/index.jsp"><img src="../imgs/1.png" alt=""></a>
    </div>
    <div class="text">用户评价</div>
    <!--内容部分-->
    <c:forEach items="${list}" var="list">
             <div class="zhuneirong">
                <div class="tp">
                    <img src="../imgs/13.png" alt="">
        <div class="tot">
            <h5>155********</h5>
            <p>西安租户 <span>2019.8.29</span></p>
        </div>
                </div>
                <div class="textg">已经第二次在这家租车了，价格实惠，并且车 <br>也特别好用，易上手，好评！</div>
                  <div class="tupian">
                      <div class="imgs">
                          <img src="${list.image}" alt="">
                          <img src="../imgs/8.png" alt="">
                      </div>
                      <!--服务评价-->
                  <div class="fuwupingjia">
                      <p>服务评价</p>
                      <div class="bout">
                          <img src="../imgs/5.png" alt="">
                          <img src="../imgs/5.png" alt="">
                          <img src="../imgs/5.png" alt="">
                          <img src="../imgs/5.png" alt="">
                          <img src="../imgs/5.png" alt="">

                      </div>
                      <div class="bout1">
                          <img src="../imgs/3.png" alt="">
                          <span>199</span>
                          <img src="../imgs/4.png" alt="">
                          <span>280</span>
                      </div>
                  </div>
                  </div>
             </div>
    </c:forEach>

</div>
</body>
<script src="../js/zepto.min.js"></script>
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

// $(".bout img").click(function () {
//      $(".bout img").css({
//          background:"red"
//
//      })
// })
</script>
</html>