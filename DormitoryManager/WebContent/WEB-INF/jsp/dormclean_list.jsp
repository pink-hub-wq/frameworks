<%--
  Created by IntelliJ IDEA.
  User: 周训凯
  Date: 2019/4/24
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
 <%@ page contentType="text/html;charset=UTF-8" language="java"  import="com.seiryo.po.DormGrade"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
    <title>后台登录</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <%--<meta http-equiv="Cache-Control" content="no-siteapp" />--%>

    <link rel="icon" href="images/favicon.ico" sizes="32x32" />
    <link rel="stylesheet" href="css/font.css">
    <link rel="stylesheet" href="css/xadmin.css">
    <script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
    <script src="lib/layui/layui.js"></script>
    <script type="text/javascript" src="js/xadmin.js"></script>
    <script src="layui_exts/excel.js"></script>

    <style type="text/css">
        .layui-table{
            text-align: center;
        }
        .layui-table th{
            text-align: center;
        }
    </style>
</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="findDormClean">宿舍卫生</a>

      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="findDormClean" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" action="findDormClean" >
            <input class="layui-input" placeholder="请输入宿舍编号" name="d_id" id="d_id" value="${d_id}">
            <input class="layui-input" placeholder="请输入宿舍楼" name="d_dormbuilding" id="d_dormbuilding" value="${d_dormbuilding}">

            <input class="layui-input" type="hidden" name="pageIndex" value="1">
            <input class="layui-input" type="hidden" name="pageSize" value="3">
            <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <xblock>
        <button id="addStudnetBtn" class="layui-btn layui-btn-normal"> <i class="layui-icon">&#xe654;</i>添加 </button>
        <button class="layui-btn layui-btn-warm" lay-filter="toolbarDemo" lay-submit=""><i class="layui-icon">&#xe67c;</i>导出</button>
        <span class="x-right" style="line-height:40px">共有数据：${di.totalCount} 条</span>
    </xblock>

    <%--添加模态框--%>
    <div class="layui-row" id="test" style="display: none;">
        <div class="layui-col-md10">
            <form class="layui-form" id="addEmployeeForm">
                <div class="layui-form-item">
                    <label class="layui-form-label">宿舍编号：</label>
                    <div class="layui-input-block">
                        <input type="text" name="d_id" class="layui-input" placeholder="请输入宿舍编号">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">宿舍楼：</label>
                    <div class="layui-input-block">
                        <input type="text" name="d_dormbuilding" class="layui-input" placeholder="请输入宿舍楼">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">宿舍卫生：</label>
                    <div class="layui-input-block">
                        <input type="text" name="d_grade" class="layui-input" placeholder="请输入卫生打分">
                    </div>
                </div>

                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button type="button" class="layui-btn layui-btn-normal" lay-submit lay-filter="formDemo">提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>


    <%--表格数据--%>
    <table class="layui-table">
        <thead>
        <tr>
            <%--<th>--%>
                <%--<div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>--%>
            <%--</th>--%>
            <th>ID</th>
            <th>宿舍编号</th>
            <th>宿舍楼</th>
            <th>宿舍卫生</th>
            <th>创建日期</th>
            <th>更新日期</th>
            <th>操作</th>
        </thead>
        <tbody>
        <c:forEach items="${di.list}" var="di">
            <tr>
                <%--<td>--%>
                    <%--<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>--%>
                <%--</td>--%>
                <td>${di.g_id}</td>
                <td>${di.d_id}</td>
                <td>${di.d_dormbuilding}</td>
                <td>${di.d_grade}</td>
                <td>${di.create_time}</td>
                <td>${di.update_time}</td>
                <td>
                    <a title="编辑"    id= "updateEdit"    href="findDormCleanById?g_id=${di.g_id}">
                        <i class="layui-icon">&#xe642;</i>
                    </a>
                    <a title="删除" onclick="member_del(this,'${di.g_id}')" href="javascript:;">
                        <i class="layui-icon">&#xe640;</i>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="" >
        <input type="hidden" id="totalPageCount" value="${di.pageTotalCount}"/>
        <c:import url="pageBtn.jsp">
            <c:param name="totalCount" value="${di.totalCount}"/>
            <c:param name="currentPageNo" value="${di.pageIndex}"/>
            <c:param name="totalPageCount" value="${di.pageTotalCount}"/>
        </c:import>
    </div>
    <script>

        layui.config({
            base: 'layui_exts/',
        }).extend({
            excel: 'excel',
        });

        layui.use(['jquery', 'excel','form','layer','laydate'], function(){
            var form = layui.form,
                $ = layui.jquery,
                laydate = layui.laydate;
            var excel = parent.layui.excel;

            //执行一个laydate实例
            laydate.render({
                elem: '#start' //指定元素
            });

            form.on('submit(toolbarDemo)', function(){

                $.ajax({
                    url: 'exportdormcleanlist',
                    type: 'post',
                    dataType: 'json',
                    contentType: "application/json; charset=utf-8",
                    success: function (data) {
                        console.log(data);

                        // 1. 如果需要调整顺序，请执行梳理函数
                        var dt = excel.filterExportData(data, [
                            'g_id'
                            ,'d_id'
                            ,'d_dormbuilding'
                            ,'d_grade'
                            ,'create_time'
                            ,'update_time'
                        ]);

                        // 2. 数组头部新增表头
                        dt.unshift({g_id: 'ID', d_id: '宿舍编号', d_dormbuilding: '宿舍楼', d_grade: '宿舍卫生', create_time: '创建日期', update_time: '更新日期'});

                        // 意思是：A列40px，B列60px(默认)，C列120px，D、E、F等均未定义
                        var colConf = excel.makeColConfig({
                            'E': 160,
                            'F': 160
                        }, 60);

                        var timestart = Date.now();
                        // 3. 执行导出函数，系统会弹出弹框
                        excel.exportExcel({
                            sheet1: dt
                        }, '宿舍卫生数据.xlsx', 'xlsx', {
                            extend: {
                                '!cols': colConf
                            }
                        });

                        var timeend = Date.now();
                        var spent = (timeend - timestart) / 1000;
                        layer.alert('导出耗时 '+spent+' s');
                        //setTimeout(function () {window.location.href='/findAdmin';},2000);
                    },

                    error: function () {
                        //console.log(data);
                        setTimeout(function () {window.location.href='findDormClean';},2000);
                    }
                });
            });

            /*添加弹出框*/
            $("#addStudnetBtn").click(function () {
                layer.open({
                    type:1,
                    title:"添加班级",
                    skin:"myclass",
                    area:["50%"],
                    anim:2,
                    content:$("#test").html()
                });
                $("#addEmployeeForm")[0].reset();
                form.on('submit(formDemo)', function(data) {
                    // layer.msg('aaa',{icon:1,time:3000});
                    var param=data.field;
                    // console.log(JSON.stringify(param));
                    $.ajax({
                        url: 'addDormClean',
                        type: "post",
                        data:JSON.stringify(param),
                        contentType: "application/json; charset=utf-8",
                        success:function(){
                            layer.msg('添加成功', {icon: 1, time: 3000});
                            setTimeout(function () {window.location.href='findDormClean';},2000);

                        },
                        error:function(){
                            layer.msg('添加失败',{icon:0,time:3000});
                            setTimeout(function () {window.location.href='findDormClean';},2000);
                        }
                    });
                    // return false;
                });
            });
        });




        /*删除*/
        function member_del(obj,g_id){
            layer.confirm('确认要删除吗？',function(index){
                //发异步删除数据
                $.get("deleteDormClean",{"g_id":g_id},function (data) {
                    if(data =true){
                        layer.msg('删除成功!',{icon:1,time:2000});
                        setTimeout(function () {window.location.href='findDormClean';},2000);

                    }else {
                        layer.msg('删除失败!',{icon:1,time:2000});
                        setTimeout(function () {window.location.href='findDormClean';},2000);
                    }
                });
            });
        }


        /*批量删除*/
        function delAll (obj,s_id) {

            var data = tableCheck.getData();
            layer.confirm('确认要删除吗？'+data,function(s_id){
                //捉到所有被选中的，发异步进行删除
                layer.msg('删除成功', {icon: 1});
                $(".layui-form-checked").not('.header').parents('tr').remove();
            });
        }
    </script>


</body>


</html>

