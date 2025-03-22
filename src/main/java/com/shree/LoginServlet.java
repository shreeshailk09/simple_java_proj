package com.shree;

import java.io.IOException;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet") // URL Mapping
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get username & password from the login form
        String inuser = request.getParameter("username");
        String inpwd = request.getParameter("password");

        try {
            // Load credentials from config.properties
            ResourceBundle rb = ResourceBundle.getBundle("config"); 
            String username = rb.getString("username");
            String password = rb.getString("password");

            // Authentication Check
            if (inuser != null && inpwd != null && inuser.equals(username) && inpwd.equals(password)) {
                HttpSession session = request.getSession();
                session.setAttribute("user", inuser); // Store user in session
                response.sendRedirect("welcome.jsp"); // ✅ FIXED
            } else {
                response.sendRedirect("login.jsp?error=Invalid Credentials"); // ✅ FIXED
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp?error=Server Error"); // ✅ FIXED
        }
    }
}
