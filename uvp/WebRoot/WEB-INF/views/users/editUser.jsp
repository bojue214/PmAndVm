<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码信息</title>
<style type="text/css">
	table{
		border:1px solid red;
		width:50%;
		border-collapse: collapse; 
	}
	
	table td{
		
	}
	
	input[type="text"]
	{
		width:100px;
		margin:10px;
		background-color: yellow; 
	}

</style>
</head>
<body>

	<form id="userForm"
		action="${pageContext.request.contextPath }/editUserSubmit.action"
		method="post" enctype="multipart/form-data">
		<input type="hidden" name="id" value="${userCustom.id }" /> 修改用户信息：
		<table border=1>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" value="${userCustom.username }" readonly/></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password" value="${userCustom.password }" /></td>
			</tr>
			<tr>
				<td>角色</td>
				<td><input type="text" name="isroot" value="${userCustom.isroot } " readonly /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>

