<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>HelloDog</title>
</head>
<body>
<h1>当店にエントリーされている犬です</h1>
<br>

<table>
<tbody>
<tr>
<th>犬ID</th>
<th>犬の名前</th>
<th>犬種</th>
<th>写真</th>
<th>備考</th>
</tr>
<s:iterator value="dogDTOList">
<tr>
<td><s:property value="userId"/></td>
<td><s:property value="userName"/></td>
<td><s:property value="password"/></td>
<td><s:property value="img"/></td>
<td><s:property value="result"/></td>
</tr>
</s:iterator>
</tbody>
</table>

<div>
<span>ホーム画面に戻る場合は</span>
<a href='<s:url action="HomeAction" />'>こちら</a>
</div>

</body>
</html>


