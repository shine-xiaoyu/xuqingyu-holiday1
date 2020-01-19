<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改页面</title>
<link href="${pageContext.request.contextPath}/resource/index2.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-1.8.3.min.js"></script>
</head>

<script type="text/javascript">

	$.ajax({
		url:"/getdepartment",
		type:"get",	
		success:function(list){
			for ( var i in list) {
				$("#select1").append("<option value = '"+list[i].id+"'>"+list[i].name+"</option>")
			}
			$("#select1").val('${plan.dept_id}');
		}
	})

	function update(){
		$.ajax({
			url:"/doupdate?"+$("#form1").serialize(),	
			type:"post",
			success:function(i){
				if (i) {
					location.href = "/list";
				}
				else{
					location.href = "/update";
				}
			}
		
		})
		
		
	}
	
</script>

<body>
${plan }
	<h3>项目发布</h3>
	<form id="form1">
		<input type="hidden" name="id" value="${plan.id }">
		项目名称:<input type="text" name="name" value="${plan.name }"><br>
		所属部门: <select id="select1" name="dept_id">
		</select> <br> 投资金额:<input type="text" name="amount" value="${plan.amount }">元<br>
		分管领导:<input type="text" name="manager" value="${plan.manager }"><br>
		项目介绍:
		<textarea rows="5" cols="20" name="content">${plan.content }</textarea>
		<br>
		<button onclick="update()">发布</button>
	</form>
</body>
</html>