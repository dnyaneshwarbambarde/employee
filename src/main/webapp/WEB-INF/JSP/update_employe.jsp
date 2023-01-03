<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
   <h2>Employee | Update</h2>
    
     <form action="updateEmploye" method="post">
     <pre>
     <input type = "hidden" name ="id" value="${employe.id}"/>
      First Name <input type= "text" name ="firstName" value ="${employe.firstName}"/>
      last Name<input type="text" name ="lastName"value ="${employe.lastName}"/>
      email<input type="text" name="email"value ="${employe.email}"/>
      mobile<input type="text" name="mobile"value ="${employe.mobile}"/>
      <input type="submit" value="save"/>
      </pre>
      
     </form>
</body>
</html>