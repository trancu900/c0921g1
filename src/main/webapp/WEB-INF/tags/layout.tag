<%@ attribute name="head" fragment="true" %>
<%@ attribute name="content" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<html>
<head>
    <%@include file="head.html" %>
    <jsp:invoke fragment="head"/>
</head>
<body class="   footer-offset">

<script src="assets\vendor\hs-navbar-vertical-aside\hs-navbar-vertical-aside-mini-cache.js"></script>
<%@include file="only-dev.html" %>

<jsp:invoke fragment="content"/>

<jsp:invoke fragment="footer"/>
<%@include file="js-plugins.html" %>
</body>
</html>
