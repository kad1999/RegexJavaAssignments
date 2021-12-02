<%
	String name = request.getParameter("name");
	int income =Integer.parseInt(request.getParameter("income"));
	
	int tax = 0;
	if(income <= 250000){
		tax = 0;
	}else if(income > 250000 && income <= 500000){
		tax = 5*income/100;
	}else if(income > 500000 && income <= 750000){
		tax = 20*income/100;
	}else if(income > 750000 && income <= 1000000){
		tax = 20*income/100;
	}else{
		tax = 30*income/100;
	}

%>

<h2>Income Tax Report</h2>
<table border="1">
	<tr>
		<th>Name</th>
		<td><%=name%></td>
	</tr>
	<tr>
		<th>Income</th>
		<td><%=income %></td>
	</tr>
	<tr>
		<th>Tax</th>
		<td><%=tax %></td>
	</tr>	
</table>