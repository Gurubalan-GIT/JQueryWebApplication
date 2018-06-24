<%@ page import="com.its.guru.EntityClass" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.its.guru.Servlet" %>
<%@ page import="com.its.guru.DAO" %>
<%--
  Created by IntelliJ IDEA.
  User: Gurubalan
  Date: 24-06-2018
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registered</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/custom.css" rel="stylesheet">
    <script src="js/jQuery-3.3.1.js"></script>
    <script src="js/jQuery.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <div class="text-center">
        Success!
        <%
            String email=(String) session.getAttribute("email");
            PrintWriter output=response.getWriter();
            output.print(email);
        %>
    </div>
</body>
</html>
