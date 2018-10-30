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
		<title>Login画面</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css" />
</head>
<body>

<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>ログイン画面</p>
</div>
<div>
<h3>商品を購入する際はログインをお願いします。</h3>
<s:form action="LoginAction">
<s:textfield name="loginUserId" placeholder="ID"/>
<s:password name="loginPassword" placeholder="PASSWORD"/>
<s:submit value="ログイン"/>
</s:form>
<br/>
<div id="text-link">
<p>新規ユーザー登録は
<a href='<s:url action="UserCreateAction" />'>こちら</a></p>
<p>Homeへ戻る場合は
<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
</div>
</div>
</div>
<div id="footer">
<div id="pr">
</div>
</div>

</body>
</html>