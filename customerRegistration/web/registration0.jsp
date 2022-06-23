<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
 
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
       
    </head>
    <body style="background: url(image/hii.jpg); background-size:cover;background-attachment:fixedq       ">
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                   <div class="card">
                   <div class="card-content">
                  <div class="form center-align">
                      
                    <form action="Register">
                        <input type="text" name="fname" placeholder="Enter first name">
                        <input type="text" name="lname" placeholder="Enter last name">
                        <button type="submit" class="btn  teal" >Submit</button>
                    </form>
                   </div>
                  <div class="loader center-align" style="margin-top: 10px; display:none">
                        <div class="preloader-wrapper big active">
                          <div class="spinner-layer spinner-blue-only">
                            <div class="circle-clipper left">
                              <div class="circle"></div>
                            </div><div class="gap-patch">
                              <div class="circle"></div>
                            </div><div class="circle-clipper right">
                              <div class="circle"></div>
                            </div>
                          </div>
                        </div>
                      <h5>Please Wait..</h5>
                       </div>  
                </div>
            </div>
            </div>
        </div>
        </div>

  <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
 <script>
    $(document).ready(function()
    {
        console.log("page is ready...")
    })
    </script>
</body>    
</html>
