<%
    // 应用上下文
    request.setAttribute("path", request.getContextPath());
    // 应用资源上下文
    request.setAttribute("rpath", request.getContextPath() + "/resources");
%>

<link rel="stylesheet" href="${rpath}/resources/plugins/boostrap/bootstrap.css">
<link rel="stylesheet" href="${rpath}/resources/plugins/boostrap-table/bootstrap-table.css">

<script src="${rpath}/resources/plugins/jquery/jquery-3.1.1.js"></script>
<script src="${rpath}/resources/plugins/boostrap-table/bootstrap-table.js"></script>