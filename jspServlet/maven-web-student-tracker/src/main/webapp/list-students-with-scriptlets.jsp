<%@ page import="java.util.*, com.luv2code.web.jdbc.*" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Tracker App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<%
	// get the students from the request object (sent by servlet)
	List<Student> theStudents = 
					(List<Student>) request.getAttribute("STUDENT_LIST");
%>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Colegio Hogwarts</h2>
			<h4>de Magia y Hechicerķa</h4>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<table>
			
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<% for (Student tempStudent : theStudents) { %>
				
					<tr>
						<td> <%= tempStudent.getNombre() %> </td>
						<td> <%= tempStudent.getApellido() %> </td>
						<td> <%= tempStudent.getCasa() %> </td>
					</tr>
				
				<% } %>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








