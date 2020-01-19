<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>详情页</title>
<link href="${pageContext.request.contextPath}/resource/index2.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-1.8.3.min.js"></script>
</head>
<body>
	<div align="center">
		<h3>投资项目详情</h3>
		<table>
			<tr>
				<td>项目名称</td>
				<td>${plan.name }</td>
			</tr>
			<tr>
				<td>投资金额</td>
				<td>${plan.amount }</td>
			</tr>
			<tr>
				<td>项目领导</td>
				<td>${plan.manager }</td>
			</tr>
			<tr>
				<td>所属部门</td>
				<td>${plan.dname }</td>
			</tr>
			<tr>
				<td>项目说明</td>
				<td>${plan.content }</td>
			</tr>
		</table>
	</div>
</body>
</html>