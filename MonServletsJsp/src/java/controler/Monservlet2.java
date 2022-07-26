
package controler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Monservlet2", urlPatterns = {"/Monservlet2"})
public class Monservlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String pseudo = request.getParameter("pseudo");
        String mdp = request.getParameter("mdp");
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        
        request.setAttribute("nom", pseudo );
        
         request.getRequestDispatcher("/Acceuil.jsp").forward(request, response);
        
      /*  try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jees?useSSL=false", "root", "");
            PreparedStatement pst = con.prepareStatement("select *from user where pseudo = ? and mdp = ?"); 
            pst.setString(1, pseudo);
            pst.setString(2,mdp);
            
            ResultSet rs;
            rs = pst.executeQuery();
            if (rs.next()){
                session.setAttribute("pseudo", rs.getString("pseudo"));
                dispatcher = request.getRequestDispatcher("/Acceuil.jsp");
            }else {
                request.setAttribute(mdp, con);
                dispatcher = request.getRequestDispatcher("/Login.jsp");
            }
            dispatcher.forward(request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        
            
             
        }
    }



