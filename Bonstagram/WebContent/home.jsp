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
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Bonstagram-あなたの盆栽を庭から世界へ-</title>
<body>
<header>
<div class="header-wrapper">

<div class="header-left">
Bonstagram
</div>

<div class="header-right">
<a href="#" style="text-decoration:none">ようこそ<s:property value="loginUserId"/>さん</a>

</div>

</div>
</header>

<div id="main">
<div class="form">

<s:form action="PostAction">
<textarea name="kakikomi"></textarea>
<s:submit value="書き込む" class="sign in"/>
</s:form>
</div>


</div>

<footer>
</footer>



</body>
</html>