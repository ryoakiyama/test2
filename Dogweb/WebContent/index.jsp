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
<title>UserCreate画面</title>
</head>
<body>



<div id="main">
<div id="top">
<p>ようこそ！<s:property value="human_pass"/>さん。新しい犬を追加してください</p>
</div>
<div>
<s:if test="errorMessage !=''">
<s:property value="errorMessage" escape="false" />
</s:if>

<table>
<s:form action="UCCAction">
<tr>
<td>
<label>犬ID:</label>
</td>
<td>
<input type="text" name="loginUserId" value="" />
</td>
</tr>

<tr>
<td>
<label>犬種</label>
</td>
<td>
<input type="text" name="loginPassword" value="" placeholder="犬の種類を入力してください">
</td>
</tr>

<tr>
<td>
<label>犬の名前：</label>
</td>
<td>
<input type="text" name="userName" value="" placeholder="犬の名前を入力してください"/>
</td>
</tr>

<tr>
<td>
<label>犬の画像</label>
</td>
<td>
<input type="file" name="img">
</td>
</tr>


<s:submit value="登録"/>
</s:form>
</table>


<s:form action="DOGAction">
<s:submit value="犬一覧を見る"/>
</s:form>

</div>
</div>
<div id="footer">
<div id="pr">
</div>
</div>





</body>
</html>