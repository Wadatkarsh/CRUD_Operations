<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
</head>
<body>

<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="https://en.wikipedia.org/wiki/Raigad_Fort" class="navbar-brand"> User Management App </a>
			</div>

			
		</nav>
	</header>


<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
			
			<center> <label for="form-group" style="font-weight: bold; font-size: 40px;">REGISTER HERE</label></center>
 <form action="RegisterS">
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" name="Name" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
 
  
  <div class="form-group">
    <label for="exampleInputEmail1">User Name</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="user_email" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
 
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="user_password" id="exampleInputPassword1">
  </div>

  <button type="submit" class="btn btn-success">Submit</button>
  
</form>

</div>
<center><P>Already an user <a href="Login_Page.jsp">Login Here!</a></P></center>
</div>
</body>
</html>