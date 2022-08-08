<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE EMPLOYEE DETAILS</title>
</head>
<body>

<!-- EmployeeId, Password, EmployeeType, FirstName, LastName, Address, PhoneNo, Email, Gender, HireDate, Salary -->
<h1><center>UPDATE EMPLOYEE DETAILS PAGE </center></h1>
<h2>

<form method="POST" action="UpdateEmployeeDetailsController">

<label>Employee Id : </label><input type="text" name="id"  /disabled><label></label>
<br><br>
<label>Password : </label><input type="password" name="password">
<br><br>
<label>Employee Type : </label><input type="text" name="type">
<br><br>
<label>First Name : </label><input type="text" name="first">
<br><br>
<label>Last Name : </label><input type="text" name="last">
<br><br>
<label>Address : </label><input type="text" name="address">
<br><br>
<label>Phone No : </label><input type="text" name="phone">
<br><br>
<label>Email : </label><input type="text" name="email">
<br><br>
<label>Gender : </label><input type="text" name="gender">
<br><br>
<label>Hire Date : </label><input type="date" name="hireDate">
<br><br>
<label>Salary : </label><input type="number" name="salary">
<br><br>

<input type="submit" value="submit">
</form>
</h2>
</body>
</html>

    