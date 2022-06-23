<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <link href="https://fonts.googleapis.com/
              css?family=Josefin+Sans&display=swap" rel="stylesheet">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <!--<meta name="viewport" content="width=device-width, initial-scale=1.0"/>-->   
        <style>
            *{font-fmaily: 'Josefin Sans',sans-serif;}
            h5s {
                color: blueviolet; }
            .logo { 
                width: auto;
                height: auto;
                float:0;
                padding:5px 0px 0px 320px;
            }
        </style>
    </head>
    <body> 
        <nav class = "blue lighten-1">
            <div class="nav-wrapper  container ">
                <a href="#!" class="brand-logo">Customer DashBoard</a>
                <ul class="right hide-on-med-and-down">
                    <li ><a href="menu1.jsp">Home</a></li>
                    <li ><a href="showAll.jsp">Show-All</a></li>
                    <li ><a href="login1.html">Logout</a></li>            
                </ul>   
            </div>  
        </nav>  
        <%  Cookie c[] = request.getCookies();
           if (c != null) {
                out.print( "<h5>&nbsp;&nbsp; User name is :  " + c[1].getValue() + "</h5>");
            } else {
                response.sendRedirect("login1.html");}
        %>
        <div class="logo">
            <img src="image/search.png" alt="example" class="logo"/>
        </div>
        <!--contect form--> 
        <section>
            <h3 class="center-align blue-text">Search Customers Details</h3>
            <div class="row">
                <div class="col m6 l6 offset-l3">
                    <div class="row">
                        <form action="search.jsp" class="col s12">
                            <div class="row">
                                <div class="input-field col s6">
                                    <input id="Party_Id" type="text" class="validate" name="u" required>
                                    <label for="Party_Id">Enter Your Id</label>
                                </div>
                                <div class="input-field col s6">
                                    <input id="First_name" type="text" class="validate" name="u1">
                                    <label for="First_name">Enter Your Name</label>
                                </div>
                            </div>
                    </div>
                    <div class="col m6 l6 offset-l5">
                        <button class="btn waves-effect waves-light" type="submit" name="action" 
                                onclick="M.toast({html: 'your form has been submitted'})" >SEARCH
                        </button>
                    </div>      
                </div>
            </div>
        </section>
        <script>
            $(document).ready(function () {
                $('.modal').modal();
                $('input#mobile').characterCounter();
            });
        </script>
    </body>
</html>