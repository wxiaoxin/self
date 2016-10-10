<%
    // 应用上下文
    request.setAttribute("path", request.getContextPath());
    // 应用资源上下文
    request.setAttribute("rpath", request.getContextPath() + "/resources");
%>

<link rel="stylesheet" href="${path}/resources/plugins/boostrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${path}/resources/plugins/boostrap-table/bootstrap-table.min.css">

<script src="${path}/resources/plugins/jquery/jquery-3.1.1.js"></script>
<script src="${path}/resources/plugins/boostrap/js/bootstrap.js"></script>
<script src="${path}/resources/plugins/boostrap-table/bootstrap-table.js"></script>
<script src="${path}/resources/plugins/boostrap-table/bootstrap-table-zh-CN.js"></script>