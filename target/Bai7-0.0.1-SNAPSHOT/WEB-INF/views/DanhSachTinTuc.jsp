<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.container{
 width: 60%;
 border: 1px solid;
}
table{
width: 100%;

}
img{
width: 100%;


}

</style>
</head>
<body>
<div class="container">
	<div class="header">
		<p align="center"><img alt="" src="images/nav.PNG"> </p>
		<p align="center">
			 <a href="${pageContext.request.contextPath}/DanhSachTinTuc">Danh sách tin tức</a>
			<a href="${pageContext.request.contextPath}/">Thêm tin tức mới</a>
			<a href="${pageContext.request.contextPath}/">Chức năng quản lý</a>
		</p>
	</div>
	<div  class="body" >
		<p align="center">
		<table >
			<c:forEach var="dm" items="${dstt}">
			<tr>
				<td colspan="3">Tên danh mục :${dm.tieuDe}</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>Tiêu đề</td>
				<td>Nội dung</td>
				<td>Liên kết</td>
			</tr>
			
			</c:forEach>
		
		</table>
		</p>
	</div>
	<div align="center"  class="footer">NguyenThiMinh 17105661</div>
</div>
</body>
</html>