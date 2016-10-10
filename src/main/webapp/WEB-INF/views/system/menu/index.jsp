<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜单列表</title>
    <%@ include file="../../common/init.jsp" %>
</head>
<body>

<div class="container">
    <h1>Bootstrap Table Examples</h1>
    <div id="toolbar">
        <button id="add" class="btn btn-primary">新增</button>
        <button id="remove" class="btn btn-danger" disabled>删除</button>
    </div>
    <table id="table"></table>
</div>

<script src="${path}/resources/js/system/menu/list.js"></script>

</body>
</html>
