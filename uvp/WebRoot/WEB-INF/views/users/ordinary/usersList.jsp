<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resource/css/admin.css" rel="stylesheet" type="text/css" />
<title>查询用户列表</title>
<script type="text/javascript">

/* 	function deleteItems() {
		document.itemsForm.action = "${pageContext.request.contextPath }/deleteItems.action";
		document.itemsForm.submit();
	}

	function queryItems() {
		document.itemsForm.action = "${pageContext.request.contextPath }/queryItems.action";
		document.itemsForm.submit();
	}

	function editItemsQuery() {
		document.itemsForm.action = "${pageContext.request.contextPath }/editItemsQuery.action";
		document.itemsForm.submit();
	}
	
	function addItems() {
		document.itemsForm.action = "${pageContext.request.contextPath }/addItems.action";
		document.itemsForm.submit();
	}*/
	
/* 	function goToHanderPage()
	{
	
	} */
	
/* 	function goToUpPage()
	{
		document.itemsForm.action = "${pageContext.request.contextPath }/queryItems.action?id=-1&pageNow=${page.pageNow}";
		document.itemsForm.submit();
	}
	
	function goToDownPage()
	{
		document.itemsForm.action = "${pageContext.request.contextPath }/queryItems.action?id=-2&pageNow=${page.pageNow}";
		document.itemsForm.submit();
	}
	
	function goToTailPage()
	{
		document.itemsForm.action = "${pageContext.request.contextPath }/queryItems.action?id=-3&pageNow=${page.totalPageCount}";
		document.itemsForm.submit();
	} */
	
</script>

</head>
<body>
	
	<!--头部-->
	<div id="header">
		<c:if test="${ username != null}">
			${username }
		</c:if>
		<a href="${pageContext.request.contextPath }/logout.action">[退出]</a>
		</div>
		
	<!--主体-->	
	<div>
		<form name="usersForm"
		action="#"
		method="post">
			<table id="dataList">
				<tr class="headerData">
					<td>
						<input type="checkbox">全选
					</td>
					<td>管理员ID</td>
					<td>姓名</td>
					<td>角色</td>
					<td>操作</td>
					</tr>
				<tr>
						<td><input type="checkbox" name="user_id" value="${userCustom.id}"></td>
						<td>${userCustom.id } </td>
						<td>${userCustom.username }</td>
						<td>${userCustom.isroot }</td>
						<td>
							<a href="${pageContext.request.contextPath }/editUser.action?id=${userCustom.id}">修改</a>
							</td>
					</tr>
			</table>
			</form>
		</div>
	
	<!--尾部-->
	<div id="footer">
		页面结尾
	</div>

			<%--分页显示商品信息 --%>
<%-- 			<tr>
				<td colspan="6">
					<table border="0">
						<tr>
							<td width="200">共${page.totalCount}条记录</td>
							<td width="200">共${page.totalPageCount}页</td>
							<td width="200">每页显示${page.pageSize}条</td>
							<td width="200" >当前第${page.pageNow}页</td>
							<td width="400" align="center">
				 				<a href="javascript:queryItems()">&lt;首页&gt; </a>
								<a href="javascript:goToUpPage()">&lt;上一页&gt;</a> 
								<a href="javascript:goToDownPage()">&lt;下一页&gt;</a>
								<a href="javascript:goToTailPage()">&lt;末页&gt;</a>
								</td>
							<td width="400" align="right">
							 	每页显示<input name="pageSize" value="${page.pageSize}" width="20%" style="width: 26px; "/>条
							 	<input type="button" value="确定" onclick="queryItems()" />
							 </td>
						 	</tr>
					 </table>
					 </td>
			</tr>
			 --%>
</body>
</html>