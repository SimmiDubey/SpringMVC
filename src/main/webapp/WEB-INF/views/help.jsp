<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <h2>Here is ModelAndView controller</h2>
 
 <h3>id is hare</h3>
 
 <%String name=(String)request.getAttribute("name"); 
    Integer id=(Integer)request.getAttribute("id"); 
 
 %>

<h2>Name is <%=name%> </h2>
<h2>Id is <%=id%></h2>
</body>	
</html>