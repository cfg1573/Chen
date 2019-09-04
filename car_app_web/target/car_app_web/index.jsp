<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/swiper-4.1.6.min.css">
    <link rel="stylesheet" href="../css/my.css">
    <link rel="stylesheet" type="text/css" href="../css/public.css">
    <link rel="stylesheet" type="text/css" href="../css/mobileSelect.css">
    <script src="../js/mobileSelect.js" type="text/javascript"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/vant@2.1/lib/index.css">
    <!--<link rel="stylesheet" type="text/css" href="../css/public.css">-->

    <!-- 引入样式和js文件 -->
    <!--<link rel="stylesheet" type="text/css" href="../css/mobileSelect.css">-->
</head>

<body>
    <div class="boxindex">
        <div class="fenx">
            <div class="header">
                <img id="gt" class="yut" src="../imgs/icon-01@2x.png" alt="">
                <p>平驾租车</p>
                <a href="../html/ping.html"><img src="../imgs/icon-02@2x.png" alt=""></a>
            </div>
            <div class="nav">
                <ul>
                    <li>国内自驾</li>
                    <li><a href="../html/daohang.html">地图导航</a></li>
                    <li><a href="../html/mendian.jsp">门店</a></li>
                    <li><a href="../html/shping.html">筛选</a></li>
                </ul>

            </div>
        </div>

        <div class="swiper-container">
            <div class="swiper-wrapper">
                <div class="swiper-slide">

                </div>
                <div class="swiper-slide"></div>
                <div class="swiper-slide"></div>
            </div>
            <div class="swiper-pagination"></div>
        </div>
        <div class="qukaui">
            <div class="titlet">
                <h3>短租</h3>
                <h3>长租</h3>
            </div>
            <div class="titlet1">
                <div class="post">
                    <p>取车城市</p>
                    <h4><a href="../html/chengshi.html">北京</a></h4>
                    <img src="../imgs/icon-03@2x.png" alt="">
                </div>
                <div class="post">
                    <p>还车城市</p>
                    <h4>请选择</h4>
                    <img src="../imgs/icon-03@2x.png" alt="">
                </div>
            </div>
            <div class="titlet2">
                <div class="post">
                    <p>取车时间</p>
                    <h4>9月1日</h4>
                    <p>今天 18:00</p>
                </div>
                <div class="post1">
                    <p>4小时</p>
                </div>
                <div class="post">
                    <p>还车时间</p>
                    <h4 class="ht">9月1日</h4>
                    <p class="pt">今天 22:00</p>
                </div>
            </div>

            <!-- 上门取车和异地还车 -->
            <div class="rou">
                <div>
                    <!-- <img src="../imgs/选车@2x.png" alt=""> -->
                    <span><img src="" alt=""></span>
                    <input type="hidden" value="smqc">
                    <span>上门取车</span>
                </div>
                <div>
                    <!-- <img src="../imgs/选车@2x.png" alt=""> -->
                    <span><img src="" alt=""></span>
                    <input type="hidden" value="ydhc">
                    <span>异地取车</span>
                </div>
            </div>
            <a href="../html/shping.html"><button>立即选车</button></a>
            <div class="che">
                <h4>车型推荐</h4>
                <img src="../imgs/更多@2x.png" alt="">
            </div>
            <div class="carimg">
                <div class="er">
                    <a href="">
                        <a href="../html/s"><img src="../imgs/img-03@2x.png" alt=""></a> </a>
                    <h1>宝马3系GT</h1>
                    <p class="p1">日租价: ￥<span>299</span></p>
                </div>
                <div class="er">
                    <a href="../html/shping.html"><img src="../imgs/未标题-1.png" alt=""></a>
                    <h1>路虎·大柱</h1>
                    <p class="p2">日租价: ￥<span>899</span></p>
                </div>
            </div>
            <div class="carimg wt">
                <div class="er">
                    <a href="../html/shping.html"> <img src="../imgs/1(4)@2x.png" alt=""></a>
                    <h1>本田·思域</h1>
                    <p class="p1">日租价: ￥<span>199</span></p>
                </div>
                <div class="er">
                    <a href="../html/shping.html"> <img src="../imgs/1(1)@2x.png" alt=""></a>
                    <h1>本田·思域</h1>
                    <p class="p2">日租价: ￥<span>189</span></p>
                </div>
            </div>
            <div class="carimg wt">
                <div class="er zx">
                    <a href="../html/shping.html"> <img src="../imgs/东风日产%20-轩逸.png" alt=""></a>
                    <h1>东风日产·轩逸</h1>
                    <p class="p1">日租价: ￥<span>199</span></p>
                </div>
                <div class="er">
                    <a href="../html/shping.html"><img src="../imgs/1111111.png" alt=""></a>
                    <h1>保时捷·卡宴</h1>
                    <p class="p2">日租价: ￥<span>389</span></p>
                </div>
            </div>
            <div class="carimg wt">
                <div class="er zx">
                    <a href="../html/shping.html"><img src="../imgs/宝马3.png" alt=""></a>
                    <h1>宝马3系GT</h1>
                    <p class="p1">日租价: ￥<span>199</span></p>
                </div>
                <div class="er zx">
                    <a href="../html/shping.html"><img src="../imgs/本田.png" alt=""></a>
                    <h1>本田·旋风</h1>
                    <p class="p2">日租价: ￥<span>199</span></p>
                </div>
            </div>
        </div>


    </div>
    <!--<div class="contain">-->
    <!--<div id="trigger2">-->
    <!--111-->
    <!--</div>-->
    <!--</div>-->
    <div class="mycebianlan">
        <div id="my" class="my">
            <div class="header">
                <img src="../imgs/h'%20(11).png" alt="">
                <p>王海龙</p>
                <p>133****2436</p>
            </div>
            <div class="liebiao">
                <div class="qs">
                    <div class="qs1">
                        <img src="../imgs/h'%20(1).png" alt="">
                        <p class="qa"><a href="../html/qianbao.html">我的钱包</a></p>
                    </div>
                    <img src="../imgs/h'%20(9).png" alt="">
                </div>
                <div class="qs">
                    <div class="qs1">
                        <img src="../imgs/h'%20(2).png" alt="">
                        <a href="../html/dingdanliebiao.html">
                            <p>我的订单</p>
                        </a>
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
        <div id="mask1" class="cebianlanzhezhao"></div>
    </div>
    <div class="contain">
        <div class="ghj">
            <p>取消</p>
            <p>3天</p>
            <p>确定</p>
        </div>
        <div class="worst">
            <h4>取车时间</h4>
            <p></p>
            <h4>还车时间</h4>
            <p></p>
        </div>
        <div class="wom">
            <div id="trigger2">
                <p>08-31 <span>08:00</span> </p>
            </div>
            <div id="trigger3">
                <p>09-02 <span>08:00</span></p>
            </div>
        </div>
        <!-- <div class="wb">
            <div class="wtb">
                <p>08-28 周三</p>
                <p>05</p>
            </div>
            <div class="wtb bn1">
                <p>08-29 周四</p>
                <p>06</p>
            </div>
            <div class="wtb bn2">
                <p>08-30 周五</p>
                <p>07</p>
            </div>
            <div class="wtb bn3">
                <div>
                    <img src="../imgs/l@2x.png" alt="">
                    <p>08-31 周六</p>
                    <img src="../imgs/r@2x.png" alt="">
                </div>

                <p>
                    <img src="../imgs/l@2x.png" alt="">
                    08 &nbsp;00
                    <img src="../imgs/r@2x.png" alt="">
                </p>
            </div>
            <div class="wtb bn5">
                <p>09-01 周日</p>
                <p>09</p>
            </div>
            <div class="wtb bn6">
                <p>09-02 周一</p>
                <p>01</p>
            </div>
            <div class="wtb bn7">
                <p>09-03 周二</p>
                <p>02</p>
            </div>

        </div> -->

    </div>


</body>

<script src="../js/zepto.min.js"></script>
<script src="../js/touch.js"></script>
<script src="../js/swiper.js"></script>
<script src="../js/vue.js"></script>
<script src="../js/mobileSelect.js" type="text/javascript"></script>
<script src="../js/fontsize.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vant@2.1/lib/vant.min.js"></script>
<script>


    var mySwiper = new Swiper('.swiper-container', {
        autoplay: {
            disableOnInteraction: false,
        },
        loop: false,
        pagination: {
            el: '.swiper-pagination',
            paginationType: "bullets",
        },
    });



    $(".titlet2 .post").click(function () {
        $(".bufen").css({
            display: "block",
            // transform: "translateY(5.2rem)",
            transition: "1s linear;"
        })
    })
    $('.mycebianlan .cebianlanzhezhao').on("click", function () {
        $(this).hide();
        // $('.my').animate({transform:'translateX(-5.2rem)'},500,function(){
        //
        // });
        $('.my').css({
            display: "none"
        });
    });

    $('.boxindex .header .yut').on('click', function () {
        $('.mycebianlan .cebianlanzhezhao').show();
        $('.mycebianlan').show();
        $('.my').animate({ transform: 'translateX(5.2rem)' }, 500, function () {
            $('.mycebianlan').hide();
        });
    })




    
    $(".nav ul li").eq(0).click(function () {
        $(".nav ul li").eq(1).css({
            backgroundColor: "black"
        })
        $(".nav ul li").eq(0).css({
            backgroundColor: "rgb(209,51,57)",
            borderRadius: "0.26rem"
        })
        $(".nav ul li").eq(2).css({
            backgroundColor: "black"
        })
        $(".nav ul li").eq(3).css({
            backgroundColor: "black"
        })
    })
    $(".nav ul li").eq(1).click(function () {
        $(".nav ul li").eq(1).css({
            backgroundColor: "rgb(209,51,57)",
            borderRadius: "0.26rem"
        })
        $(".nav ul li ").eq(0).css({
            backgroundColor: "black"

        })
        $(".nav ul li ").eq(2).css({
            backgroundColor: "black"

        })
        $(".nav ul li ").eq(3).css({
            backgroundColor: "black"

        })
    })
    $(".nav ul li").eq(2).click(function () {
        $(".nav ul li").eq(2).css({
            backgroundColor: "rgb(209,51,57)",
            borderRadius: "0.26rem"
        })
        $(".nav ul li ").eq(1).css({
            backgroundColor: "black"

        })
        $(".nav ul li ").eq(3).css({
            backgroundColor: "black"

        })
        $(".nav ul li ").eq(0).css({
            backgroundColor: "black"

        })

    })
    $(".nav ul li").eq(3).click(function () {
        $(".nav ul li").eq(3).css({
            backgroundColor: "rgb(209,51,57)",
            borderRadius: "0.26rem"
        })
        $(".nav ul li ").eq(2).css({
            backgroundColor: "black"

        })
        $(".nav ul li ").eq(1).css({
            backgroundColor: "black"

        })
        $(".nav ul li ").eq(0).css({
            backgroundColor: "black"

        })
    })

    var weekdayArr = ['08-25  周日', '08-25  周日', '08-26  周一', '08-27  周二', '08-28  周三', '08-29  周四', '08-30  周五', '08-31  周六'];
    var timeArr = ['08 : 30', '09 : 00', '09 : 30', '10 : 00', '10 : 30', '11 : 00', '11 : 30', '12 : 00', '12 : 30', '13 : 00', '13 : 30', '14 : 00', '14 : 30', '15 : 00', '15 : 30', '16 : 00', '16 : 30', '17 : 00', '17 : 30', '18 : 00', '18 : 30', '19 : 00', '19 : 30', '20 : 00', '20 : 30', '21 : 00'];
    var numArr = ['1', '2', '3', '4', '5'];
    var mobileSelect2 = new MobileSelect({
        trigger: '#trigger2',
        title: '3天',

        wheels: [
            { data: weekdayArr },
            { data: timeArr }
        ],
        position: [1, 2],
        transitionEnd: function (indexArr, data) {
            //console.log(data);
        },
        callback: function (indexArr, data) {
            console.log(data);
        }
    });


    $(".titlet2 .post").click(function () {
        $(".contain").css({
            display: "block"
        })
    })
    $(".contain .ghj p").click(function () {
        $(".contain").css({
            display: "none"
        })
    })
    $(".contain #trigger3 p").click(function () {
        $(".content").css({
            display: "block"
        })
    })
    // $(".che img").click(function () {
    //     $(".boxindex .qukaui .wt").css({
    //         display:"block"
    //     })
    // })
   
    $(".boxindex .qukaui .rou div>span:nth-child(1)").on("tap", function () {
        // console.log($(this));
        $(this).find("img").attr("src", "../imgs/选车@2x.png");
        $(this).parent().siblings().find("img").attr("src", "");

    })
</script>

</html>