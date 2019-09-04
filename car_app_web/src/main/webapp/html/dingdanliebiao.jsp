<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
    <link rel="stylesheet" href="../css/dingdanliebiao.css">
</head>
<body>
<div class="dingdanliebiao">
        <div class="header">
            <a href="/index.jsp"> <img id="gt" class="yut" src="../imgs/qq.png" alt=""></a>
            <p>订单列表</p>
            <img src="../imgs/11f.png" alt="">
        </div>
        <div class="nav">
            <a href="${pageContext.request.contextPath}/car/findAll"><p>全部</p></a>
            <a href="${pageContext.request.contextPath}/car/findByid1?order_type=2"> <p>代付款</p></a>
            <a href="${pageContext.request.contextPath}/car/findByid1?order_type=1"><p>待/已评价</p></a>


        </div>
        <div class="tuo">
            <span></span>

        </div>

<c:forEach var="list" items="${list}">
    <div class="fanhkuai shanchu">
         <div class="jiaoyi">
            <div class="imgt">
                <img src="../imgs/h.png" alt="">
                 <h1>${list.car_startShopName}</h1>
            </div>
              <p>${list.order_status==1?"交易成功":"待付款"}</p>
         </div>
        <div class="lanbo">
             <div class="tupian">
                 <img src="${list.car_image}" alt="">
             </div>
            <div class="qiche">
                <h3>${list.car_name} </h3>
                <p>${list.car_status}</p>
                <p>租用时长：${list.car_day}</p>
                <p>合计金额：<span>￥${list.car_money}</span></p>
            </div>
        </div>
        <div class="btn">
            <button onclick="del(${list.id})">删除订单</button>
            <button><a href="../pages/pingjia.jsp">来个评价</a></button>
        </div>
    </div>
</c:forEach>


</div>

</body>
<script src="../js/zepto.min.js"></script>
<script>
//    点击事件弹出函数
    function del(id) {
      if(confirm("你确定要删除吗")){
          location.href="${pageContext.request.contextPath}/car/del?id="+id;
      }
    }

    function setrem() {
        var windowwidth = window.innerWidth;
        var newpx = (windowwidth / 750) * 100;
        $('html').css('fontSize', newpx);
    }
    setrem();
    window.onresize = function () {
        setrem();
    };
$(".btn .dj").click(function () {
    $(".shanchu").css({
        display:"none"
    })
})
    $(".btn .dj1").click(function () {
        $(".shanchu1").css({
            display:"none"
        })
    })
    $(".btn .dj2").click(function () {
        $(".shanchu2").css({
            display:"none"
        })
    })
</script>
</html>