<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Home画面</title>
</head>
<body>
<div id="header">
<div id="pr">
</div>
</div>

<div id="main">
<div id="top">
<p>Login</p>
</div>

<div>
<h3>犬を購入する際はログインしないと買えません</h3>
<s:form action="LoginAction">
<s:textfield name="human_id" placeholder="idを入力してください" />
<s:password name="human_pass" placeholder="パスワードを入力してください"/>
<s:submit value="ログイン"/>
</s:form>

<div id="footer">
<div id="pr">
</div>
</div>


</div>
</div>




</body>
</html>