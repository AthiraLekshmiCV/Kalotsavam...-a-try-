<%-- 
    Document   : groupevents
    Created on : 3 Dec, 2015, 11:59:51 AM
    Author     : new
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script type="text/javascript">
//window.alert("Only 5 members in a group");

function checkboxlimit(checkgroup, limit){
var checkgroup=checkgroup;
	var limit=limit;
	for (var i=0; i<checkgroup.length; i++){
		checkgroup[i].onclick=function(){
		var checkedcount=0;
		for (var i=0; i<checkgroup.length; i++)
			checkedcount+=(checkgroup[i].checked)? 1 : 0;
		if (checkedcount>limit){
			alert("You can only select a maximum of "+limit+" individual events");
			this.checked=false;
			}
		};
	}
        
}

</script>
<style>
p{
position: fixed;
    bottom: 400px;
    right: 350px;
}
div{

position: fixed;
    bottom: 50px;
    right: 450px;
}
body {
    background-repeat: no-repeat;
    }
 
</style>
</head>
<body background = "images/dance1.jpg">

<h1 style="color:red" align ="center">Kalothsavam Group Events</h1>
<div  name="one" align="left|right|center|justify">

<form id="world" name="world" action="Groupevents" method="get">
<input type="checkbox" name="c" id="c1" value="s"/>Semi classical dance <br />
<input type="checkbox" name="c" id="c2" value="g"/> Group Song<br />
<input type="checkbox" name="c"  id="c3" value="t" /> Thiruvathira<br />
<input type="checkbox" name="c" id="c4" value="d"/> Drama<br />
<input type="checkbox" name="c" id="c5" value="gm"/> Ganamela<br />
<input type="checkbox" name="c" id="c6" value="ms"/>Movie spoof<br />
<input type="checkbox" name="c" id="c7" value="ng"/> Nostalgia<br />
<input type="checkbox" name="c" id="c8" value="cd" /> Classical dance<br />
<input type="checkbox" name="c" id="c9"value="mm" />Mime<br />

<script type="text/javascript">
checkboxlimit(document.forms.world.c, 4)
</script>
  First member:<br>
  <input type="text" name="firstmember" id="as" >
  <br>
   Second member:<br>
  <input type="text" name="secondmember" >
  <br>
   Third member:<br>
  <input type="text" name="thirdmember" >
  <br>
   Fourth member:<br>
  <input type="text" name="fourthmember" >
  <br>
 Fifth member:<br>
  <input type="text" name="fifthmember" >
  <br><br>
 
  <input type="submit" value="Submit" >
    <button class="float-left submit-button" >Home</button>


<p name="Enter your house name">
<select name="hnme">
  <option value="AMRITAMAYI" name="hnme">AMRITAMAYI</option>
  <option value="ANANDAMAYI" name="hnme">ANANDAMAYI</option>
  <option value="CHINMAYI"  name="hnme">CHINMAYI</option>
  <option value="JYOTHIRMAYI"  name="hnme">JYOTHIRMAYI</option>
</select>
</form>
</div>
</p>
</body>
</html>
