<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
</head>
<body>  
    <marquee class="bg-primary"> 
            <h2 class="text-white">${login_fail}</h2> 
    </marquee> 
 <section class=" gradient-custom"> 
      <div class="container py-5 "> 
        <div class="row d-flex justify-content-center align-items-center ">                
           <div class="col-12 col-md-8 col-lg-6 col-xl-5"> 
          <div class="card bg-dark text-white" style="border-radius: 1rem;">             
          <div class="card-body p-5 text-center"> 
          <div class="mb-md-2 mt-md-2 pb-2"> 
               <form action="login">  
                   <h2 class="fw-bold mb-2 text-uppercase">Login</h2>  
                   <p class="text-white-50 mb-2">Please enter your login and  password!</p>  
          <div class="form-outline form-white mb-4">  
            <input type="text" id="typeEmailX" name="username" class="form-control form
control-lg" /> 
 <label class="form-label" for="typeEmailX" >Username</label> 
 </div> 
 
 <div class="form-outline form-white mb-4"> 
       <input type="text" id="typePasswordX"  name="password" class="form-control form
control-lg" /> 
 <label class="form-label" for="typePasswordX" >Password</label> </div> 
 <button class="btn btn-outline-light btn-lg "  type="submit">Login</button>  
</form> 
 </div> 
 </div> 
 </div> 
 </div>  
</div>  
</div> 
 </section> 
 </body>
</html>