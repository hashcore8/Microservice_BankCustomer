<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer registration form</title>
<link rel="stylesheet" href="../css/cust.css" type="text/css"></link>
</head>
<body>
	<form:form method="POST" action="/customer/postcustomer"
		modelAttribute="customer">

		<table>
			<tr>
				<td><form:label path="F_name">Name</form:label></td>
				<td><form:input path="F_name" /></td>
				<td><form:errors path="F_name" cssClass="error" /></td>
			</tr>

			<tr>
				<td><form:label path="L_name">Last Name</form:label></td>
				<td><form:input path="L_name" /></td>
				<td><form:errors path="L_name" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="HouseNo">HouseNo</form:label></td>
				<td><form:input path="HouseNo" /></td>
				<td><form:errors path="HouseNo" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="street">Street</form:label></td>
				<td><form:input path="street" /></td>
				<td><form:errors path="street" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="Area">Area</form:label></td>
				<td><form:input path="Area" /></td>
				<td><form:errors path="Area" cssClass="error" /></td>
			</tr>

			<tr>
				<td><form:label path="pincode">pincode</form:label></td>
				<td><form:input path="pincode" /></td>
				<td><form:errors path="pincode" cssClass="error" /></td>
			</tr>
			
			<tr>
			<td><form:label path="birthday">birthday</form:label></td>
			<td><form:input path="birthday" type="date"/></td>
			<td><form:errors path="birthday" cssClass="error" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>

		</table>
	</form:form>





	<%-- 	<form action="register" method="post" >
<pre>
                  Name <input type="text" name="name" />
         Email address <input type="text" name="emailAddress" />
              Password <input type="password" name="password" />
                        <input type="submit" value="Submit" />
</pre>
</form> --%>



</body>
</html>