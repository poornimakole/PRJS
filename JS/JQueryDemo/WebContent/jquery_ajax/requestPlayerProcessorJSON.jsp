<% 
int playerno = Integer.parseInt(request.getParameter("playerno"));
if(playerno == 10){
     out.println("{\"name\": \"Sachin Tendulkar\",\"city\": \"Mumbai\"}");
}
else
if(playerno == 19){
          out.println("{\"name\": \"Rahul Dravid\",\"city\": \"Bengaluru\"}");
     }
else
if(playerno == 99){
          out.println("{\"name\": \"Saurav Ganguly\",\"city\": \"Kolkata\"}");
     }
else
     {
          out.println("{\"name\": \"Upasana Bhagat\",\"city\": \"Pune\"}");
     }
%>
