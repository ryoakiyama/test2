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
<title>CreateItem画面</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />
</head>
<body>

<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>商品追加画面</p>
</div>
<div>

<h3>どのような商品を追加しますか？</h3>

<s:form action="CreateItemConfirmAction">
<table>
<tr>
<td>
<span>商品名</span>
</td>
<td>

<input type="text" name="newItemName" value="" />

</td>
</tr>
<tr>

<td>
<span>値段</span>
</td>
<td>
<input type="text" name="newItemPrice" value="" />
</td>
</tr>

<tr>
<td>
<span>在庫</span>
</td>
<td>

<input type="text" name="newItemStock" value="" />

</td>
</tr>

<s:submit value="商品を追加する"/>
</table>

</s:form>
<br/>
<div id="text-link">
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