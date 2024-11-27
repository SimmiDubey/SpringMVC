<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>hello here is home controller</h2>
   <h2>hello controller</h2>
   
   <% 
    String name =(String)request.getAttribute("name");
    
   Integer id=(Integer)request.getAttribute("id");
   
    %>
    
     <h1>Name is <%=name%><h1>
   
   <h2>Id is <%=id%></h2>
   
   <h3>hello controller</h3>
 
</body>
</html>