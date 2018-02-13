<%
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
if(name.equalsIgnoreCase("administrator") && pwd.equalsIgnoreCase("test")){
	out.println("You are logged in as Administrator");
}
else{
	
	out.println("You are not logged in as Administrator");
}





%>