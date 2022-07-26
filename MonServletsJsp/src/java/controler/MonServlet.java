
package controler;

import classes.Utilisateur;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@WebServlet(name = "MonServlet", urlPatterns = {"/MonServlet"})
public class MonServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudo = request.getParameter("pseudo");
        String email = request.getParameter("email");
        String mdp = request.getParameter("mdp");
        String mdp2 = request.getParameter("mdp2");
        RequestDispatcher dispatcher = null;
        Connection con = null;
        
        request.setAttribute("nom", nom );
        
        HttpSession session=request.getSession();
        List<Utilisateur> liste=(List)session.getAttribute("liste");
        if(liste==null){
            liste=new ArrayList<Utilisateur>();
        }
        
        Utilisateur user=new Utilisateur(nom,prenom,pseudo,email,mdp);
        
        liste.add(user);
        session.setAttribute("liste", liste);
        request.getRequestDispatcher("/Acceuil.jsp").forward(request, response);
        
        
       /* try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jees?useSSL=false", "root", "");
            PreparedStatement pst = con
                    .prepareStatement("insert into user(nom,prenom,pseudo,email,mdp) values(?,?,?,?,?) ");  
                pst.setString(1, nom);
                pst.setString(2, prenom);
                pst.setString(3, pseudo);
                pst.setString(4, email);
                pst.setString(5, mdp);

            int rowCount = pst.executeUpdate();
            dispatcher = request.getRequestDispatcher("inscrire.jsp");
            if (rowCount > 0){
                request.setAttribute("status", "succes");
            }else {
                request.setAttribute("status", "faillet");
            }
            
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();           
        }
        //finally {
        //        try{
        //            con.close();
        //        }catch(SQLException e){
        //            e.printStackTrace();     
        //        }
                
        //    }
        
     */   
    }


}
