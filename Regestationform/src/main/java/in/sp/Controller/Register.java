package in.sp.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sp.dbcon.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regesform")
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String myname = req.getParameter("name1");
        String myemail = req.getParameter("mail1");
        String mypass = req.getParameter("password1");
        String myusername = req.getParameter("username1");
        String mycity = req.getParameter("city1");

        try {
            Connection con = DbConnection.getConnection();
            String insert_sql_query =
                    "INSERT INTO regester(name, email, password, username, city) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insert_sql_query);

            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypass);
            ps.setString(4, myusername);
            ps.setString(5, mycity);

            int count = ps.executeUpdate();

            if (count > 0) {
                out.println("<h3 style='color:green'>Registered successfully!</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/login.html");
                rd.include(req, resp);
            } else {
                out.println("<h3 style='color:red'>Registration failed!</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/regester.html");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3 style='color:red'>Exception: " + e.getMessage() + "</h3>");
        }
    }
}
