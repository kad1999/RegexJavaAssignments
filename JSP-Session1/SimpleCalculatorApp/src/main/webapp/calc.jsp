<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String option = request.getParameter("option");
	double result = 0;
	switch(option){
	case "ADD":
		result = num1+num2;
		break;
	case "SUBTRACT":
		result = num1-num2;
		break;
	case "MULTIPLY":
		result = num1*num2;
		break;
	case "DIVIDE":
		if(num2!=0){
			result = num1/num2;
		}
		break;
	default:
		break;
	}
	
%>


<h3>
	<%
		if(option.equals("DIVIDE") && num2==0){
			out.println("<p>Divide by zero not possible</p>");
		}else{
	%>
	Result of <%=num1%> <%=option%> <%=num2%> is <%=result%>
	<%} %>
</h3>	
