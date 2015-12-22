<%-- 
    Document   : ind_events
    Created on : 3 Dec, 2015, 12:03:01 PM
    Author     : new
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 
        
 <html>
 <head>
    <title></title>
    
    <script type="text/javascript">
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
    bottom: 170px;
    right: 450px;
}
#pp{
    
    right:100px;
}

body {
    background-repeat: no-repeat;
    }
</style>
  </head>
  <body  background = "images/artsfon.com-53139.jpg">
    <form id="world" name="world" action="Indevents">

<h1 style="color:red" align ="center">Kalothsavam Individual Events</h1>
<div align="left|right|center|justify">
Enter your roll number:<br>
  <input type="text" name="roll" >
  <br>
<input type="checkbox" name="c" value="rc"/>Recitation <br />
<input type="checkbox" name="c" value="ec" /> Elocution<br />
<input type="checkbox" name="c"  value="pd"/> Pencil Drawing<br />
<input type="checkbox" name="c" value="kr"/>Karoke<br />
<input type="checkbox" name="c" value="cld"/> Classical dance<br />
<input type="checkbox" name="c" value="sc"/>Semi Classical<br />
<input type="checkbox" name="c" value="fd"/> fancy dress<br />
<input type="checkbox" name="c" value="ml"/> Monologue<br />
<input type="submit" value="Submit" ><br>

<button class="float-left submit-button" >Home</button>

<script type="text/javascript">
checkboxlimit(document.forms.world.c, 5)
</script>
</div>
<p name="name" id="pp" >
<select name="hnme">
  <option value="AMRITAMAYI">Amritamayi</option>
  <option value="ANANADAMAYI">Anandamayi</option>
  <option value="CHINMAYI">Chinmayi</option>
  <option value="JYOTHIRMAYI">Jyothirmayi</option>
</select>
</p>
    </form>
  </body>
</html>