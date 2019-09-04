<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- 页面meta -->
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">

	<title>数据 - AdminLTE2定制版</title>
	<meta name="description" content="AdminLTE2定制版">
	<meta name="keywords" content="AdminLTE2定制版">

	<!-- Tell the browser to be responsive to screen width -->
	<meta
			content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
			name="viewport">

	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/morris/morris.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/select2/select2.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/css/style.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

	<!-- 页面头部 -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- 页面头部 /-->

	<!-- 导航侧栏 -->
	<jsp:include page="aside.jsp"></jsp:include>
	<!-- 导航侧栏 /-->

	<!-- 内容区域 -->
	<div class="content-wrapper">

		<!-- 内容头部 -->
		<section class="content-header">
			<h1>
				用户管理 <small>全部用户</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="${pageContext.request.contextPath}/index.jsp"><i
						class="fa fa-dashboard"></i> 首页</a></li>
				<li><a
						href="${pageContext.request.contextPath}/user/findAll">用户管理</a></li>

				<li class="active">全部用户</li>
			</ol>
		</section>
		<!-- 内容头部 /-->

		<!-- 正文区域 -->
		<section class="content"> <!-- .box-body -->
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">列表</h3>
				</div>

				<div class="box-body">

					<!-- 数据表格 -->
					<div class="table-box">

						<!--工具栏-->
						<div class="pull-left">
							<div class="form-group form-inline">
								<div class="btn-group">
									<button type="button" class="btn btn-default" title="新建" onclick="location.href='${pageContext.request.contextPath}/pages/user-add.jsp'">
										<i class="fa fa-file-o"></i> 新建
									</button>

									<%--<button type="button" class="btn btn-default" title="刷新" onclick="location.href='page=${pagenum}&size=${userList.pageSize}'">--%>
										<%--<i class="fa fa-refresh"></i> 刷新--%>
									<%--</button>--%>
								</div>
							</div>
						</div>
						<div class="box-tools pull-right">
							<div class="has-feedback">
								<input type="text" class="form-control input-sm" id="word" onkeyup="search()"
									   placeholder="搜索"> <span
									class="glyphicon glyphicon-search form-control-feedback"></span>
							</div>
							<div id="proID" style="margin-top: 10px;display: none;z-index: 5;position: absolute ;border: 1px solid red;width: 185px"></div>
						</div>
						<!--工具栏/-->

						<!--数据列表-->
						<table id="dataList"
							   class="table table-bordered table-striped table-hover dataTable">
							<thead>
							<tr>
								<th class="" style="padding-right: 0px"><input
										id="selall" type="checkbox" class="icheckbox_square-blue">
								</th>
								<th class="sorting_asc">ID</th>
								<th class="sorting_asc sorting_asc_disabled">邮箱</th>
								<th class="sorting_asc sorting_asc_disabled">电话</th>
								<th class="sorting_asc sorting_asc_disabled">验证码</th>
								<th class="sorting_asc sorting_asc_disabled">用户名</th>
								<%--<th class="sorting_asc sorting_asc_disabled">地址</th>--%>
								<%--<th class="sorting_asc sorting_asc_disabled">城市</th>--%>
								<%--<th class="sorting_asc sorting_asc_disabled">头像</th>--%>
								<%--<th class="sorting_asc sorting_asc_disabled">金额</th>--%>
								<%--<th class="sorting_asc sorting_asc_disabled">积分</th>--%>
								<th class="sorting_asc sorting_asc_disabled">操作</th>
							</tr>
							</thead>
							<tbody>

							<c:forEach items="${userList.list}" var="user" varStatus="i">
								<tr>
									<td><input name="ids" type="checkbox"></td>
									<td>${i.count}</td>
									<td>${user.email }</td>
									<td>${user.telephone }</td>
									<td>${user.code }</td>
									<td>${user.name }</td>
										<%--<td>${user.address }</td>--%>
										<%--<td>${user.cityName }</td>--%>
										<%--<td width="10%"><img src="${user.user_image}" width="100%" ></td>--%>
										<%--<td>${user.money }</td>--%>
										<%--<td>${user.member}</td>--%>
									<td class="text-center">
										<a href="${pageContext.request.contextPath}/user/findByid?uid=${user.uid}" >用户详情</a>
										<a href="${pageContext.request.contextPath}/user/delByid?uid=${user.uid}" >删除</a>
										<a href="${pageContext.request.contextPath}/user/findByidUI?uid=${user.uid}" >修改</a>
									</td>
								</tr>
							</c:forEach>
							</tbody>
							<!--
                        <tfoot>
                        <tr>
                        <th>Rendering engine</th>
                        <th>Browser</th>
                        <th>Platform(s)</th>
                        <th>Engine version</th>
                        <th>CSS grade</th>
                        </tr>
                        </tfoot>-->
						</table>
						<!--数据列表/-->

					</div>
					<!-- 数据表格 /-->

				</div>
				<!-- /.box-body -->

				<!-- .box-footer-->
				<div class="box-footer">
					<div class="pull-left">
						<div class="form-group form-inline">
							总共${userList.pages} 页，共${userList.total} 条数据。 每页
							<select class="form-control" id="changePageSize"  onchange="changePageSize()">
								<option value="1">1</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select> 条
						</div>
					</div>

					<div class="box-tools pull-right">
						<ul class="pagination">
							<%--pageSize页面条数--%>
							<li><a href="${pageContext.request.contextPath}/user/findAll?page=1&size=${userList.pageSize}" aria-label="Previous">首页</a></li>
							<%--当前页码减1--%>
							<li><a href="${pageContext.request.contextPath}/user/findAll?page=${userList.pageNum-1}&size=${userList.pageSize}">上一页</a></li>
							<c:forEach begin="1" end="${userList.pages}" var="pagenum">
								<li><a href="${pageContext.request.contextPath}/user/findAll?page=${pagenum}&size=${userList.pageSize}">${pagenum}</a></li>
							</c:forEach>

							<%--当前页码加1--%>
							<li><a href="${pageContext.request.contextPath}/user/findAll?page=${userList.pageNum+1}&size=${userList.pageSize}">下一页</a></li>
							<%--pages总页数--%>
							<li><a href="${pageContext.request.contextPath}/user/findAll?page=${userList.pages}&size=${userList.pageSize}" aria-label="Next">尾页</a></li>
						</ul>
					</div>

				</div>
				<!-- /.box-footer-->

			</div>

		</section>
		<!-- 正文区域 /-->

	</div>
	<!-- @@close -->
	<!-- 内容区域 /-->

	<!-- 底部导航 -->
	<footer class="main-footer">
		<div class="pull-right hidden-xs">
			<b>Version</b> 1.0.8
		</div>
		<strong>Copyright &copy; 2019-09-02 <a
				href="http://www.baidu.cn">9502联合项目组研发部</a>.
		</strong> All rights reserved. </footer>
	<!-- 底部导航 /-->

</div>

<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="../plugins/raphael/raphael-min.js"></script>
<script src="../plugins/morris/morris.min.js"></script>
<script src="../plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="../plugins/knob/jquery.knob.js"></script>
<script src="../plugins/daterangepicker/moment.min.js"></script>
<script src="../plugins/daterangepicker/daterangepicker.js"></script>
<script src="../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
<script
		src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
		src="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="../plugins/fastclick/fastclick.js"></script>
<script src="../plugins/iCheck/icheck.min.js"></script>
<script src="../plugins/adminLTE/js/app.min.js"></script>
<script src="../plugins/treeTable/jquery.treetable.js"></script>
<script src="../plugins/select2/select2.full.min.js"></script>
<script src="../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
		src="../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
		src="../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="../plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="../plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="../plugins/ckeditor/ckeditor.js"></script>
<script src="../plugins/input-mask/jquery.inputmask.js"></script>
<script
		src="../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="../plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="../plugins/datatables/jquery.dataTables.min.js"></script>
<script src="../plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="../plugins/chartjs/Chart.min.js"></script>
<script src="../plugins/flot/jquery.flot.min.js"></script>
<script src="../plugins/flot/jquery.flot.resize.min.js"></script>
<script src="../plugins/flot/jquery.flot.pie.min.js"></script>
<script src="../plugins/flot/jquery.flot.categories.min.js"></script>
<script src="../plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="../plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script>

    function changePageSize() {
//			    获取下拉框
        var pageSize=$("#changePageSize").val();
//向服务器发送请求，改变页面显示的条数为+pageSize
        location.href="${pageContext.request.contextPath}/user/findAll?page=1&size="+pageSize;
    }


	function search() {
		var proID= $("#proID").val();
        var word=$("#word").val();
        if(word.trim()==""){
            proID.hide();
            return;
		}
		$.get(
		"/user/search",
		"word="+word,


            function(data){
                // div  显示出来
                proID.show();
                //定义字符串  拼接商品名
                var s="";
                // data传回来的是json    是个数组   [key:v,key1:v2]
                $.each(data,function(index,element){
                    s+="<div onmouseout='out(this)' onmouseover='over(this)' style='border-bottom:1px solid #606060'>"+element.pname+"</div>";
                });
                proID.html(s);
            },"json"
        );
    }
    function over(obj){
        $(obj).css("background-color","yellow");
    }
    function out(obj){
        $(obj).css("background-color","green");
    }

    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale : 'zh-CN'
        });
    });

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document)
        .ready(
            function() {

                // 激活导航位置
                setSidebarActive("admin-datalist");

                // 列表按钮
                $("#dataList td input[type='checkbox']")
                    .iCheck(
                        {
                            checkboxClass : 'icheckbox_square-blue',
                            increaseArea : '20%'
                        });
                // 全选操作
                $("#selall")
                    .click(
                        function() {
                            var clicks = $(this).is(
                                ':checked');
                            if (!clicks) {
                                $(
                                    "#dataList td input[type='checkbox']")
                                    .iCheck(
                                        "uncheck");
                            } else {
                                $(
                                    "#dataList td input[type='checkbox']")
                                    .iCheck("check");
                            }
                            $(this).data("clicks",
                                !clicks);
                        });
            });
</script>
</body>

</html>