<%@ page contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<%@ include file="./common/init.jsp" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>首页</title>

    <link href="${rpath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${rpath}/font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Toastr style -->
    <link href="${rpath}/css/plugins/toastr/toastr.min.css" rel="stylesheet">

    <link href="${rpath}/css/style.css" rel="stylesheet">

</head>

<body>

    <%--  页面容器  --%>
    <div id="wrapper">

        <%--  左侧菜单栏  --%>
        <nav class="navbar-default navbar-static-side" role="navigation">

            <div class="sidebar-collapse">

                <ul class="nav metismenu" id="side-menu">

                    <%--  用户信息  --%>
                    <li class="nav-header">
                        <div class="dropdown profile-element" style="text-align: center;">
                            <%--用户图片--%>
                            <span>
                                <img alt="image" class="img-circle" src="${rpath}/img/profile_small.jpg" />
                            </span>
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">admin</strong></span>
                                <span class="text-muted text-xs block">详情 <b class="caret"></b></span> </span>
                            </a>
                            <%--详情--%>
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <li><a href="contacts.html">邮箱</a></li>
                                <li><a href="profile.html">手机号</a></li>
                                <li class="divider"></li>
                                <li><a href="login.html">修改密码</a></li>
                            </ul>
                        </div>
                        <%--隐藏侧边栏时显示LOGO--%>
                        <div class="logo-element">
                            <img alt="image" class="img-circle" src="${rpath}/img/profile_small.jpg" />
                        </div>
                    </li>

                    <li class="active">
                        <a href="index.html"><i class="fa fa-th-large"></i> <span class="nav-label">Dashboards</span> <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li class="active"><a href="index.html">Dashboard v.1</a></li>
                            <li><a href="dashboard_2.html">Dashboard v.2</a></li>
                            <li><a href="dashboard_3.html">Dashboard v.3</a></li>
                            <li><a href="dashboard_4_1.html">Dashboard v.4</a></li>
                        </ul>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o"></i> <span class="nav-label">Graphs</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li><a href="graph_flot.html">Flot Charts</a></li>
                            <li><a href="graph_morris.html">Morris.js Charts</a></li>
                            <li><a href="graph_rickshaw.html">Rickshaw Charts</a></li>
                            <li><a href="graph_chartjs.html">Chart.js</a></li>
                            <li><a href="graph_chartist.html">Chartist</a></li>
                            <li><a href="graph_peity.html">Peity Charts</a></li>
                            <li><a href="graph_sparkline.html">Sparkline Charts</a></li>
                        </ul>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-envelope"></i> <span class="nav-label">Mailbox </span><span class="label label-warning pull-right">16/24</span></a>
                        <ul class="nav nav-second-level collapse">
                            <li><a href="http://www.baidu.com">百度</a> </li>
                            <li><a href="http://www.sina.com.cn">新浪</a> </li>
                            <li><a href="http://www.sogou.com">搜狗</a> </li>
                        </ul>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-laptop"></i> <span class="nav-label">Grid options</span></a>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-table"></i> <span class="nav-label">Tables</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li><a href="table_basic.html">Static Tables</a></li>
                            <li><a href="table_data_tables.html">Data Tables</a></li>
                            <li><a href="table_foo_table.html">Foo Tables</a></li>
                            <li><a href="jq_grid.html">jqGrid</a></li>
                        </ul>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-sitemap"></i> <span class="nav-label">Menu Levels </span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li>
                                <a href="#">Third Level <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                </ul>
                            </li>
                            <li><a href="#">Second Level Item</a></li>
                            <li>
                                <a href="#">Second Level Item</a></li>
                            <li>
                                <a href="#">Second Level Item</a></li>
                        </ul>
                    </li>

                </ul>

            </div><%--菜单结束--%>

        </nav><%--左结束--%>

        <%--右侧页面主体--%>
        <div id="page-wrapper" class="gray-bg dashbard-1">

            <%--  导航栏  --%>
            <div class="row border-bottom">
                <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">

                    <%--  搜索框  --%>
                    <div class="navbar-header">
                        <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
                        <form role="search" class="navbar-form-custom" action="search_results.html">
                            <div class="form-group">
                                <input type="text" placeholder="Search for something..." class="form-control" name="top-search" id="top-search">
                            </div>
                        </form>
                    </div>

                    <ul class="nav navbar-top-links navbar-right">

                        <li>
                            <%--<span class="m-r-sm text-muted welcome-message">Welcome to INSPINIA+ Admin Theme.</span>--%>
                        </li>

                        <li class="dropdown">
                            <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                                <i class="fa fa-bell"></i>  <span class="label label-primary">8</span>
                            </a>
                            <ul class="dropdown-menu dropdown-alerts">
                                <li>
                                    <a href="mailbox.html">
                                        <div>
                                            <i class="fa fa-envelope fa-fw"></i> You have 16 messages
                                            <span class="pull-right text-muted small">4 minutes ago</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="profile.html">
                                        <div>
                                            <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                            <span class="pull-right text-muted small">12 minutes ago</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="grid_options.html">
                                        <div>
                                            <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                            <span class="pull-right text-muted small">4 minutes ago</span>
                                        </div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <div class="text-center link-block">
                                        <a href="notifications.html">
                                            <strong>See All Alerts</strong>
                                            <i class="fa fa-angle-right"></i>
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">
                                <i class="fa fa-sign-out"></i>退出登陆
                            </a>
                        </li>

                    </ul>
                </nav>
            </div><%--导航栏结束--%>

            <%--  头部
                <div class="row  border-bottom white-bg dashboard-header"></div>
            --%>

            <%--  主体  --%>
            <div class="row">
                <div class="col-lg-12">
                    <div class="wrapper wrapper-content">
                            <div class="row"></div>
                    </div>
                </div>
            </div>

            <%--  底部版本信息  --%>
            <div class="footer">
                <div>
                    <strong>Copyright</strong> Example Company &copy; 2014-2015
                </div>
            </div>

        </div><%--右侧页面主体结束--%>

    </div><%--页面结束--%>

    <!-- Mainly scripts -->
    <script src="${rpath}/js/jquery-2.1.1.js"></script>
    <script src="${rpath}/js/bootstrap.min.js"></script>
    <%--菜单插件--%>
    <script src="${rpath}/js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Custom and plugin javascript -->
    <%--进度条插件--%>
    <script src="${rpath}/js/plugins/pace/pace.min.js"></script>
    <!-- 消息提示插件 -->
    <script src="${rpath}/js/plugins/toastr/toastr.min.js"></script>

    <script src="${rpath}/js/inspinia.js"></script>

    <script>
        $(document).ready(function() {

            // 欢迎信息
            setTimeout(function() {
                toastr.options = {
                    closeButton: true,
                    progressBar: true,
                    showMethod: 'slideDown',
                    timeOut: 2000
                };
                toastr.success('欢迎回来');

            }, 1300);

        });
    </script>
</body>
</html>
