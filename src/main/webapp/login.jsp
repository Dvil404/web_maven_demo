<%--
  Created by my super_powerful!
  User: ltasd
  Date: 2019/9/24 0024
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<input type="code" class="form-control" id="code" name="code"  placeholder="验证码" required>
<input  class="btn btn-default" id="btn" name="btn" value="发送验证码"
        onclick="sendMessage()" />


<script>
    var sms = "";
    var telno ;
    //发送验证码
    $("#btn").click(function() {
        var phone = $("#phone").val();
        telno = phone;
        if (phone != "") {
            $.ajax({
                url : "${pageContext.request.contextPath}/member/getcode",  //发送请求  目标地址
                type : "post",  //POST方式传输
                data : {  //发送到服务器的数据
                    "telno" : phone
                },
                success : function(result) {
                    sms = result.data;
                }
            });
        } else {
            alert("请输入手机号");
            return false;
        }
    });
</script>



</body>
</html>
