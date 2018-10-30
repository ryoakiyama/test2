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
<title>商品追加確認画面</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />

</head>
<body>
<div id="header">
<div id="pr">
</div>
</div>

<div id="main">
<div id="top">
<p>商品追加確認</p>
</div>

<div>
<h3>追加する商品の情報は以下でよろしいでしょうか。</h3>
<table border="2">

<s:form action="CreateItemCompleteAction">
<tr id="box">
<td>
<label>商品名</label>
</td>
<td>

<s:property value="newItemName" escape="false" />

</td>
</tr>
<tr id="box">
<td>
<label>値段</label>
</td>
<td>
<s:property value="newItemPrice" escape="false" />
</td>
</tr>
<tr id="box">
<td>
<label>在庫</label>
</td>
<td>
<s:property value="newItemStock" escape="false" />
</td>
</tr>
</table>

<table>
<tr>
<td>
<s:submit value="完了" />
</td>
</tr>
</s:form>
</table>
</div>
</div>

</body>
</html>