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
<title>ERROR画面</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />
</head>
<body>

<div id="header"><div id="pr"></div></div>

<div id="main"><div id="top">
<p>エラーが発生しました。</p>

</div>

<div>
<s:if test="errorMessage != ''">
<b>
<s:property value="errorMessage" />
</b>
</s:if>


<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
</div>
</div>
<div id="footer">
<div id="pr">
</div>
</div>





</body>
</html>