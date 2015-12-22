<%-- 
    Document   : adminlogin
    Created on : 30 Nov, 2015, 10:08:07 PM
    Author     : new
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        
     <html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/1.css"/>

<style>
html
{
background-image: url('images/music-wallpaper22.jpg'); 
background-repeat: no-repeat; 
background-size:100%;
}
#logout{
	float:right;
	background-image:url('images/music-wallpaper22.jpg');
	border:none;
	font-size:30px;
	cursor:pointer;
	color:white;

}
</style>


<title>HTML Form</title>
<script type="text/javascript">

function validateForm()
{
var uname=document.login.user.value;
var uname=user.trim();

var pass=document.login.pass.value;
if(uname == '')
{
alert ("Login was unsuccessful, 

please check your username and password");
return false;
}
if(pass == '')
{
alert 
("Login was unsuccessful, please check your username and password");
return false;
}
}

</script>
</head>


<body>
<input id="logout" type="button" value="Logout" onClick="location.href='index.jsp'">
<table cellpadding="10" width="700">
<center>

<caption align="Top">
<h1 style="color:black">ADMIN LOGIN</h1>
</caption>
</center>



<form method="post" name="applform"  action="admin">




<td><font size="5">Username:</font></td>


<td><input type="text" name="uname" size="30" maxlength="30" placeholder="Enter Your username" maxlength="16" 
 required></td>
</tr>
<tr>


<td><font size="5">Password:</font></td>


<td><input type="password" name="pass" size="30" placeholder="Password"  required></td>
</tr>
<tr>
<td>&nbsp;</td>
<td><input type="submit" 
value="Submit" onSubmit="validateForm();">
<input type="reset" value="Reset">
</td>
</tr>
</form>
</table>
</body>
</html>
