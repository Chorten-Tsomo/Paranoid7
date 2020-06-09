<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form method="post" action="UpdateUser">    
                         <input type="hidden" value="${user.address}" class="form-control" name="uemail" required="required">

                                                                                                                    
                            <label>First Name</label> <input type="text" value="${user.firstname}" class="form-control" name="ufname" required="required">
                        

                   
                            <label>Last Name</label> <input type="text" value="${user.lastname}" class="form-control" name="ulname">
                        
                        
                        
                        <label>Address</label> <input type="text" value="${user.phonenum}" class="form-control" name="uaddress">
                     


                        
                            <label>Password</label> <input type="text" value="${user.password}" class="form-control" name="upass">
                       

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            
        
    </body>
</html>