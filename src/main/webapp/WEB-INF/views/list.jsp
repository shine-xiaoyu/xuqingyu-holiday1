<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列表页</title>
<link href="${pageContext.request.contextPath}/resource/index2.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-1.8.3.min.js"></script>
</head>

<script type="text/javascript">
	function goPage(page){
		location.href = "/?pageNum="+page+"&"+$("#form1").serialize();
	}
	
	
</script>

<body>
	<form id="form1">
		<input type="text" name="name" value="${plan.name }">
		<input type="submit" value="查询">
	</form>

	<table>
		<tr>
			<td>编号</td>
			<td>项目名称</td>
			<td>投资资金</td>
			<td>分管领导</td>
			<td>部门</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${info.list }" var="i">
			<tr>
				<td>${i.id }</td>
				<td>${i.name }</td>
				<td>${i.amount }</td>
				<td>${i.manager }</td>
				<td>${i.dname }</td>
				<td><a href="/selectOne?id=${i.id }">查看详情</a>
				|<a href="/update?id=${i.id }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<jsp:include page="/WEB-INF/views/pages2.jsp"></jsp:include>
</body>
</html>