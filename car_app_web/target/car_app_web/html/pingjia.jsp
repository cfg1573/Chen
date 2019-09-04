<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">

    <title>Document</title>
</head>
<link rel="stylesheet" href="../css/pingjia.css">
<!-- <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css"> -->

<body>
    <div class="box">
        <div class="head">
            <a href="../html/index.html"><img src="../imgs/jiantou.png" alt=""></a>
            <span>评价</span>
        </div>
        <%--要提交表单的位置--%>
        <form action="${pageContext.request.contextPath}/car/DDPJ" method="post" enctype="multipart/form-data">
            <div class="shouxu">
                <p>整体情况</p>
                <div class="shouxuL">
                    <p>手续办理：</p>
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">

                </div>
                <div class="shouxuR">
                    <p>车辆情况：</p>
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">

                </div>
            </div>
            <div class="mendian">
                <p>门店情况</p>
                <div class="mendianL">
                    <p>取车门店：<span>郑州&nbsp;金水路店</span></p>
                </div>
                <div class="mendianR">
                    <p>服务态度：</p>
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                </div>
                <textarea name="" cols="30" rows="10" class="mendianT" placeholder="说说哪里好，其他客户想知道"></textarea>
                <div class="mendianL_T">
                    <p>还车门店：<span>郑州&nbsp;金水路店</span></p>
                </div>
                <div class="mendianR_T">
                    <p>服务态度：</p>
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                    <img src="../imgs/pingjia/icon-07@2x.png" alt="">
                </div>
                <textarea name="" id="" cols="30" rows="10" class="mendianT_T" placeholder="说说哪里好，其他客户想知道"></textarea>
            </div>
            <div class="shangchuan">
                <img src="../imgs/pingjia//img-01@2x.png" alt="">
                <input type="file" name="upload" >
                <span>评论文字/图片可以获取积分哦</span>
            </div>
            <div class="btn">
                <button type="submit">提交</button>
            </div>
        </form>
    </div>
</body>
<script src="../js/vue.js"></script>
<script src="../js/zepto.min.js"></script>
<!--<script src="../js/fontsize.js"></script>-->
<script>

    $.fn.prevAll = function (selector) {
        var prevEls = [];
        var el = this[0];
        if (!el) return $([]);
        while (el.previousElementSibling) {
            var prev = el.previousElementSibling;
            if (selector) {
                if ($(prev).is(selector)) prevEls.push(prev);
            }
            else prevEls.push(prev);
            el = prev;
        }
        return $(prevEls);
    };


    $.fn.nextAll = function (selector) {
      var nextEls = [];
      var el = this[0];
      if (!el) return $([]);
      while (el.nextElementSibling) {
        var next = el.nextElementSibling;
        if (selector) {
          if($(next).is(selector)) nextEls.push(next);
        }
        else nextEls.push(next);
        el = next;
      }
      return $(nextEls);
    };


    function setrem() {
        var windowwidth = window.innerWidth;
        var newpx = (windowwidth / 750) * 100;
        $('html').css('fontSize', newpx);
    }
    setrem();
    window.onresize = function () {
        setrem();
    };

    

    $('.shouxu>.shouxuL>img').click(function () {
        var index;
        index = $(this).index() - 1;
        // console.log($('.shouxu>.shouxuL>img').eq(index))
        $('.shouxu>.shouxuL>img').eq(index).attr("src", "../imgs/pingjia/icon-06@2x.png").prevAll().attr("src", "../imgs/pingjia/icon-06@2x.png");
        $('.shouxu>.shouxuL>img').eq(index).nextAll().attr("src", "../imgs/pingjia/icon-07@2x.png");
    });
    
    $('.shouxu>.shouxuR>img').click(function () {
        var index;
        index = $(this).index() - 1;
        // console.log($('.shouxu>.shouxuL>img').eq(index))
        $('.shouxu>.shouxuR>img').eq(index).attr("src", "../imgs/pingjia/icon-06@2x.png").prevAll().attr("src", "../imgs/pingjia/icon-06@2x.png");
        $('.shouxu>.shouxuR>img').eq(index).nextAll().attr("src", "../imgs/pingjia/icon-07@2x.png");
    });

    $('.mendianR>img').click(function () {
        var index;
        index = $(this).index() - 1;
        // console.log($('.shouxu>.shouxuL>img').eq(index))
        $('.mendianR>img').eq(index).attr("src", "../imgs/pingjia/icon-06@2x.png").prevAll().attr("src", "../imgs/pingjia/icon-06@2x.png");
        $('.mendianR>img').eq(index).nextAll().attr("src", "../imgs/pingjia/icon-07@2x.png");
    });
    $('.mendianR_T>img').click(function () {
        var index;
        index = $(this).index() - 1;
        // console.log($('.shouxu>.shouxuL>img').eq(index))
        $('.mendianR_T>img').eq(index).attr("src", "../imgs/pingjia/icon-06@2x.png").prevAll().attr("src", "../imgs/pingjia/icon-06@2x.png");
        $('.mendianR_T>img').eq(index).nextAll().attr("src", "../imgs/pingjia/icon-07@2x.png");
    });
</script>

</html>