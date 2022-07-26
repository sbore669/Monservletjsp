<%-- 
    Document   : Login
    Created on : 22 juil. 2022, 17:44:30
    Author     : sbbore
--%>

<%-- 
    Document   : inscrire
    Created on : 22 juil. 2022, 14:38:43
    Author     : sbbore
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div class="centre">
            <h1>Login</h1>
            <form action="${pageContext.servletContext.contextPath}/Monservlet2" method="post">
            <table>
                <tr>
                    <td><input type="pseudo" name="pseudo" placeholder="pseudo" required></td>
                </tr>
                
                <tr>
                    <td><input type="password" name="mdp" placeholder="Mot de passe" required></td>
                </tr>
                
                <br><br>
                <tr>
                    
                </tr>

                
                <tr>
                    <td><input type="submit" name="s'inscrire" value="Login" class="sins"></td> 
                </tr>
            </table>
        </form>
         </div>
        <style>
            *{
                margin: 0;
                padding: 10px;
                
             }
             h1{
                display: block;
                font-size: 2em;
                margin-block-start: 0em;
                text-align: center;
                }
            body{
                 margin: 20px;
                 padding: 20px;
                 background: linear-gradient(249deg,#2f78a9, #c79f9f42);
                }
                

            .centre
                    {
                    position: relative;
                    top: 221px;
                    left: 601px;
                    transform: translate(-50%, -50%);
                    width: 428px;
                    background: #514fc11a;
                    border-radius: 46px;
                    box-shadow: -29px 10px 15px rgb(30 17 83 / 18%);
                    height: 600px;
                    margin-block: 222px;
                    }
            input
                    {
                    padding: 1px 2px;
                    width: 320px;
                    } 
            but
                    {
                    border-radius: 30px;
                    }
            input[type="submit"]
                    {
                            width: 125px;
    border-color: #000000;
    background-color: #85cbb3;
    border-radius: 10px;
    height: 45px;
                    } 
            input[type="reset"] 
                    {
                        width: 125px;
    margin: -165px;
    border-radius: 10px;
    border-color: #000000;
    background-color: #85cbb3;
    height: 45px;
                    }        
    


        </style>
        
    </body>
</html>
