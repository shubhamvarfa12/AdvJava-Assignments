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
 <%
//            String s = (String) session.getAttribute("partyID");
//              if(s!=null) 
//              { Cookie c1 = null;
            Cookie c[] = request.getCookies();
            if (c != null) {
                //		 for (int i = 0; i < c.length; i++) {
                //                c1 = c[i];
                out.print(
                        "<h5>&nbsp;&nbsp; User name is :  " + c[1].getValue() + "</h5>");
//                out.println("welcome " + c[0].getName());
            } else {
                response.sendRedirect("login1.html");
            }
        %>
        <!--contect form--> 
        <section>
            <div class="logo">
                <img src="image/aa.png" alt="example" class="logo"/>
            </div>               <!--<img class=" responsive-img" src="aa.png ">-->
            <!--</div>-->
            <h3 class="center-align blue-text">Delete Customers Details</h3>
            <div class="row">
                <div class="col m8 l6 offset-l4">
                    <div class="row">
                        <form action="delete.jsp" class="col s12">

                            <div class="row">
                                <div class="input-field col s6">
                                    <input id="mobile" type="text" class="validate" name="up" data-length="10">
                                    <label for="Mobile">Enter Password</label>
                                </div>
                            </div>
                            <div class="col m6 l6 offset-9">
                                <button class="btn waves-effect waves-light" type="submit" name="b1" 
                                        onclick="M.toast({html: 'your form has been submitted'})" >Submit
                                </button>
                            </div>
                        </form>
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