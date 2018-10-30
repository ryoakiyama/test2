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
<a href="#" style="text-decoration:none">ログイン</a>

</div>

</div>
</header>

<div id="main">
<div class="bg">
<div class="main-container">
<div class="main-p">
<h1>Welcom to Bonstagram!</h1>
<p>Bonstagramでは、あなたの盆栽を庭から世界に届けます</p>
</div>

<div id="btn-wrapper">


<s:form action="LoginAction">
ログインはこちら<s:textfield name="loginUserId" placeholder="ID"/>
<s:password name="loginPassword" placeholder="PASS" />
<s:submit value="ログイン" class="sign in"/>
</s:form>

<br>
<a href="#" class="sign up" style="text-decoration:none">新規登録はこちら</a>
</div>


</div>
</div>
</div>

<footer>
</footer>



</body>
</html>