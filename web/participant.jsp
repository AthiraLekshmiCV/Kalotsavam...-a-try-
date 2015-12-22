<%-- 
    Document   : participant
    Created on : 30 Nov, 2015, 10:16:21 PM
    Author     : new
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

       
   
<html>
<head> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HTML Form</title>
<script type="text/javascript">
function validateForm()
{
var uname=document.login.user.value;
var uname=user.trim();
var pass=document.login.pass.value;
if(uname == '')
{
alert ("Login was unsuccessful, please check your username and password");
return false;
}
if(pass == '')
{
alert ("Login was unsuccessful, please check your username and password");
return false;
}
}
</script>
<style>
body{
	background-repeat:repeat;

}
html{
	background-image:url('images/dd3.png');

}
div{
	position:absolute;
	width:50%;
	height:330px;
	top:150px;
	left:300px;
	background:white;;

}

</style>
</head>
<body background-image="images/ece29141ff3266295959361c1a1f0e5a.jpg">
<div>
<table cellpadding="10" width="700">
<center>
<caption align="Top">
<h1>Participant Registration Form</h1>
</caption>
</center>

<form method="get" action= "maLog" name="applform">
<!--<tr>
<td>Name</td>
 	<td><input type="text" name="name" size="30" maxlength="30" placeholder="Enter Your Name" autofocus required></td>
</tr>

<tr>
<td>Gender</td>
<td><input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female
</td>
</tr>
-->
<tr>
<td>Register Number:</td>
<td><input type="text" name="uname" size="30" maxlength="30" placeholder="Enter Your rollno:" maxlength="16" pattern ="(AM)[\.](EN)[\.](U4)((CSE)|(EEE)|(ECE)|(ME))(1)[0-5][0-9]{3}" required></td>
</tr>
<tr>
<td>House:</td><td>
<select name="House">
<option value="AMRITAMAYI">AMRITAMAYI</option>
<option value="CHINMAYI">CHINMAYI</option>
<option value="JYOTHIRMAYI">JYOTHIRMAYI</option>
<option value="ANANDAMAYI">ANANDAMAYI</option>
</select>
</td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="pass" size="20" placeholder="Password"  required></td>
</tr>
<tr>
<td>&nbsp;</td>
<td><input type="submit" value="Submit" onSubmit="validateForm();">
<input type="reset" value="Reset">
</td>
</tr>
</form>
</table>
</div>
</body>
</html>