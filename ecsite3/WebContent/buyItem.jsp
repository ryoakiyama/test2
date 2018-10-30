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
<title>BuyItem画面</title>
<link rel="stylesheet" type="text/css" href="./css/style.css" />


</head>
<body>

<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>商品購入</p>
</div>
<div>
<p>

<s:if test="errorMessage != ''">
<b>
<s:property value="errorMessage" />
</b>
</s:if>

</p>
<h3>どの商品を購入しますか？</h3>

<s:form action="BuyItemAction">
<table border="2">
<tr>

<th>#</th>
<th>商品ID</th>
<th>商品名</th>
<th>値段</th>
<th>購入個数</th>

</tr>

<s:iterator value="#session.buyItemDTOList">
	<tr>
	<td><s:checkbox name="checkList" class="select" value="checked" fieldValue="%{id}"/></td>
	<td><s:property value="id" /><s:hidden name="id" value="%{id}" /></td>
	<td><s:property value="itemName" /><s:hidden name="itemName" value="%{itemName}" /></td>
	<td><s:property value="itemPrice" /><s:hidden name="itemPrice" value="%{itemPrice}" /></td>
	<td><select name="count" class="select">
		<option value="1" selected="selected">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		</select></td>

	</tr>
</s:iterator>
</table>

<table>
<tr>
<td><span>支払い方法を選んでください</span></td>
</tr>

<tr>
<td>
<input type="radio" name="pay" value="1" checked="checked">現金払い
<input type="radio" name="pay" value="2">クレジットカード
</td>
</tr>

<tr><td><s:submit value="購入"/></td></tr>
</table>
</s:form>

<div>
<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
<p>マイページは<a href='<s:url action="MyPageAction" />'>こちら</a></p>
</div>
</div>
</div>

<div id="footer">
<div id="pr">
</div>
</div>

</body>
</html>