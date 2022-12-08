<%@ page import ="java.util.*"%>
<%@ page import ="net.database.eventPageServlet"%>
<%@ page import ="net.database.Event"%>
<%@ page import ="net.database.EventDao"%>
<%@ page import ="net.database.EventDao"%>
<%-- <%@ page import ="/tabulator-master/dist/js/tabulator.js"%>
 --%>


<% ArrayList eventList = (ArrayList)request.getAttribute("EventList");%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@page import="net.database.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
 
 <script type="text/javascript" src="testt.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
 
  <script>
  var val;
  var amTickets;
  </script>
  
<script type="text/javascript" charset="utf8" src=" https://code.jquery.com/jquery-3.5.1.js"></script>
 <script src ="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">




<title>HomePage</title>

</head>
<body>

 <div id="mainDiv" class="container" align="center">
  <h1>You have logged in successfully!</h1>
  <h2>Events</h2>
  <hr>
  
  <input  type="text" id="myInput" onkeyup='tableSearch()' placeholder="Search">
  
  
  
  
<table class="table" id="myTable" data-filter-control="true" data-show-search-clear-button="true">
<thead>
<tr>
<td>Name</td>
<td>Date</td>
<td>EventID</td>
<td>Inventory</td>
</tr>
</thead>
<% for(int cnt=0; cnt<eventList.size();cnt++){ %>
<tbody>
<tr>
<% Event e=(Event)eventList.get(cnt); %>
<td>

<%=e.GetName() %>

</td>
<td>

<%=e.getDate() %>

</td>
<td>

<%=e.getEventID() %>

</td>
<td>

<%=e.getCount() %>

</td>


</tr>
<%} %>
</tbody>
</table>
<input type="button" id="tst" value="Submit" onclick="fnselect()" />
		
 </div>
 

 

 
 
 
 
 <div class="center hideform">
    <button id="close" style="float: right;">X</button>
    <form onsubmit ="showAlert()" action="eventInventoryServlet">
    	<h1>Complete Payment</h1>
    	<h2  id="header2" name="ysy" >Everest Presentation - $20 per ticket</h2>
    	<h3>20$ per Ticket</h3>
    	<table style="with: 100%">
 
    	
    	
    	
    	
        
        
        <tr>
      <td>  Amount of Tickets:</td>
      <td>  <input type="number" max="10" id= amTickets name="AmTickets" value="2"></td>
       <td>  <input type="hidden" id="eventName" name="EventName" value="1"/> </td>
       <tr>
     <td>   Credit Card Number </td>
        
      <td>  <input type='text' pattern="\d{16}" name="Credit Card #" ></td>
         </tr>
         <tr>
      <td>  3 Digit CVV </td>
        
      <td>  <input type='text' pattern='\d{3}' name="CVV" value=""></td>
        </tr>
        <tr>
      <td>  Expiration Date </td>

      <td>  <input type='text' pattern='.{5}' name="expDate" value=""></td>
       </tr>
       <tr>
        <td>  Total Price</td>
    <td>    <input type="number" id=totalPrice readonly> </td>
        
        </tr>
        </table>
        <input type="submit" id="submit" value="Submit" onclick="displaySuccess">
        
    </form>
</div>


<script type="application/javascript">
        function tableSearch() {
            let input, filter, table, tr, td, txtValue;

            //Intialising Variables
            input = document.getElementById("myInput");
            filter = input.value.toUpperCase();
            table = document.getElementById("myTable");
            tr = table.getElementsByTagName("tr");

            for (let i = 0; i < tr.length; i++) {
                td = tr[i].getElementsByTagName("td")[0];
                if (td) {
                    txtValue = td.textContent || td.innerText;
                    if (txtValue.toUpperCase().indexOf(filter) > -1) {
                        tr[i].style.display = "";
                    } else {
                        tr[i].style.display = "none";
                    }
                }
            }

        }
    </script>


 <script type="text/javascript">

function highlight(e) {
    if (selected[0]) selected[0].className = '';
    e.target.parentNode.className = 'selected';
    
}

var table = document.getElementById('myTable'),
    selected = table.getElementsByClassName('selected');
table.onclick = highlight;

function fnselect(){
var $row=$(this).parent().find('td');
    var clickeedID=$row.eq(0).text();
   // alert(clickeedID);
}



$("#tst").click(function(){
    value =$(".selected td:first").html();
    value = value || "No row Selected";
    val=value;
   // alert(inventory);
    document.getElementById("header2").textContent = val;
    var price = 20;
     amTickets = document.getElementById("amTickets").value;
    var total =price * amTickets;
    document.getElementById("totalPrice").innerHTML = total;
    
    
    
    
    
    

    
});





$("#submit").click(function(){
    value =$(".selected td:first").html();
    value = value || "No row Selected";
    val=value;
   // alert(inventory);
   amTickets = document.getElementById("amTickets").value;
    
    document.getElementById("eventName").value = val;   
    
   window.onload= alert("You have successfully purchased " + amTickets + " tickets to "+val);   
    
});
// function showAlert(){
// 	value =$(".selected td:first").html();
//     value = value || "No row Selected";
//     val=value;
//    // alert(inventory);
//    amTickets = document.getElementById("amTickets").value;
    
//     document.getElementById("eventName").value = val;   
    
//     alert("You have successfully purchased " + amTickets + " tickets to "+val); 
	
// }





</script>



 
<script>
const form = document.querySelector('form');
const quantityInput = document.querySelector('#amTickets');
const total= document.querySelector('#totalPrice');
form.addEventListener('input',()=>{
	const q = parseInt(quantityInput.value);
	const t = q * 20;
	total.value =t;
});
</script>
 


  



<script>
$('#tst').on('click', function () {
    $('.center').show();
    $(this).hide();
})

$('#close').on('click', function () {
    $('.center').hide();
    $('#tst').show();
})
</script>
<script>
document.getElementById("header2").textContent = val;
</script>

</body>
</html>