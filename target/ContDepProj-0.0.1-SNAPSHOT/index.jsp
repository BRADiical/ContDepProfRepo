<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
   <head> 
   	  <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
   	  <script>
   	  	$(document).on("click", "#equalsButton", function() {
   	        // send the word "PLUS" when "+" is meant due to url encoding issues with "+"
   	  		if($("#result").val().includes("+")){ 
   	  			var resultAdjusted = $("#result").val().replace("+", "PLUS");
   	  			$.ajax({
   	  				type:'GET',
   	  				contentType: "charseet=utf-8",
   	  				url:''+encodeURI('/ContDepProj/HelloServlet?equationString='+resultAdjusted),
   	  				success: function(response){
   	  					$("#result").val(response);
   	  				}
   	  			});
   	  		}
   	        // send the string as it exists in the input field otherwise
   	  		else{
   	  			$.ajax({
   	  				type:'GET',
   	  				contentType: "charset=utf-8",
   	  				url:''+encodeURI('/ContDepProj/HelloServlet?equationString='+$("#result").val()),
   	  				success: function(response){
   	  					$("#result").val(response);
   	  				}
   	  			});
   	  		}
   	  		
   	  	});
   	  </script>
      <script> 
         //function that display value 
         function dis(val) 
         { 
             document.getElementById("result").value+=val;
         } 
           
         //function that clear the display 
         function clr() 
         { 
             document.getElementById("result").value = "";
         } 
      </script> 
      <!-- for styling -->
      <style> 
         .title{ 
         margin-bottom: 10px; 
         text-align:center; 
         width: 210px; 
         color:green; 
         border: solid black 2px; 
         } 
  
         input[type="button"] 
         { 
         background-color:green; 
         color: black; 
         border: solid black 2px; 
         width:100% 
         } 
  
         input[type="text"] 
         { 
         background-color:white; 
         border: solid black 2px; 
         width:100% 
         } 
      </style> 
   </head> 
   <!-- create table to store calculator values -->
   <body> 
      <table border="1"> 
         <tr> 
            <td colspan="3"><input type="text" id="result"/></td> 
            <td><input type="button" value="c" onclick="clr()"/> </td> 
         </tr> 
         <tr> 
            <!-- create button and assign value to each button -->
            <td><input type="button" value="1" onclick="dis('1')"/> </td> 
            <td><input type="button" value="2" onclick="dis('2')"/> </td> 
            <td><input type="button" value="3" onclick="dis('3')"/> </td> 
            <td><input type="button" value="/" onclick="dis(' / ')"/> </td> 
         </tr> 
         <tr> 
            <td><input type="button" value="4" onclick="dis('4')"/> </td> 
            <td><input type="button" value="5" onclick="dis('5')"/> </td> 
            <td><input type="button" value="6" onclick="dis('6')"/> </td> 
            <td><input type="button" value="-" onclick="dis(' - ')"/> </td> 
         </tr> 
         <tr> 
            <td><input type="button" value="7" onclick="dis('7')"/> </td> 
            <td><input type="button" value="8" onclick="dis('8')"/> </td> 
            <td><input type="button" value="9" onclick="dis('9')"/> </td> 
            <td><input type="button" value="+" onclick="dis(' + ')"/> </td> 
         </tr> 
         <tr> 
            <td><input type="button" value="." onclick="dis('.')"/> </td> 
            <td><input type="button" value="0" onclick="dis('0')"/> </td> 
            <!-- solve function call function solve to evaluate value -->
            <td><input type="button" value="=" id="equalsButton"/> </td> 
            <td><input type="button" value="*" onclick="dis(' * ')"/> </td> 
         </tr> 
      </table> 
   </body> 
</html>

