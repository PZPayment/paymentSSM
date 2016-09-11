<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-1.9.0.min.js"></script>
    <script type="text/javascript" src="/js/jquery.qrcode.min.js"></script>

    <script type="application/javascript">
        window.onload = function(){
            $('#qrcode').qrcode("weixin://wxpay/bizpayurl?pr=6WDeoZP");
        }
    </script>
</head>
<body>
<%=request.getRealPath("/") %>
<br/>
<%=request.getContextPath() %>
${date}
<div id="qrcode"></div>

</body>
</html>
