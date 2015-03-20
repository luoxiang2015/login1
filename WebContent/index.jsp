<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>

<script type="text/javascript">


</script>
</head>
<body>
<form action="LoginAction1" method="post">
账号：<input type="text" id="account" name="account"  />
密码：<input type="text" id="password" name="password" />
<input type="submit" value="提交" >
</form>
<br>
<form method="post" action="Login1Action">
账号：<input type="text" id="account1" name="user.name"/>
密码：<input type="password" id="password"  name="user.password">
<input type="submit" value="对象提交">
</form>



</body>
</html>