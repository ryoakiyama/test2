<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>犬登録確認画面</title>
</head>
<body>

<div id="header">
<div id="pr">
</div>
</div>

<div id="main">
<div id="top">
<p>UserCreateConfirm</p>
</div>

<div>
<h3>登録する<s:property value="userName"/>の内容は以下でよろしいですか。
</h3>
<table>
<s:form action="UCSAction">
<tr id="box">
<td>
<label>犬ID:</label>
</td>
<td>
<s:property value="loginUserId" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>犬PASS:</label>
</td>
<td>
<s:property value="loginPassword" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>犬の名前:</label>
</td>
<td>
<s:property value="userName" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>犬の画像</label>
</td>
<td>
<s:property value="img" escape="false" />
<s:submit value="完了" />
</td>
</tr>

</s:form>
</table>
</div>
</div>
<div id="footer">
<div id="pr">
</div>
</div>
</body>
</html>