<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>hello world<br>${message}</h1>
   <a href="http://localhost:8080/SpringMVC/veda?dept=abc">Veda</a>
   <a href="http://localhost:8080/SpringMVC/vansh?dept=xyz">Vansh</a>
   <a href="http://localhost:8080/SpringMVC/vedika?dept=pqr">Vedika</a>
   <a href="http://localhost:8080/SpringMVC/vardh">Vardh</a>

    <sf:form modelAttribute="employee" method="POST">
     ID:<sf:input path="id"/><br>
      NAME:<sf:input path="name"/><br>
      EMAIL:<sf:input path="email"/><br>
      <input type="submit" value="Register">
    </sf:form>
   
   
</body>
</html>