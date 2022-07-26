<%-- 
    Document   : Acceuil
    Created on : 22 juil. 2022, 23:24:46
    Author     : sbbore
--%>

<%@page import="java.util.List"%>
<%@page import="classes.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
    </head>
       <h1>BIENVENUE <%=request.getAttribute("nom") %> </h1>
       
       
       <%
           HttpSession ses=request.getSession();
           List<Utilisateur> liste=(List)ses.getAttribute("liste");
       %>
    
        
       <form action="${pageContext.servletContext.contextPath}/Monservlet3" method="post">
           
           <input type="submit" name="Deconnecter" value="Deconnecter">
       </form>
        

       
       <table>
            <tr> 
                
                <th>NOM</th>
                <th>PRENOM</th>
                <th>PSEUDO</th>
                <th>EMAIL</th>
                   
            </tr>
            
            <% for(Utilisateur u:liste) {%>
                <tr>

                <td><%= u.getNom() %></td>
                <td><%= u.getPrenom() %></td>
                <td><%= u.getPseudo() %></td>
                <td><%= u.getEmail() %></td>

                </tr>
            <%}%>
            
                

        </table>
        
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
            table{
                border-collapse: collapse;
                margin-left: auto;
                margin-right: auto;
            }
            th, td{
  padding: 59px;
    /* margin-left: 95px; */
    padding-left: 120px;
    padding-top: 3px;
    border-style: double;
    color: lightyellow;}
        </style>    
    
    

