import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/welcome")
public class welcomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session  =req.getSession(false);
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        if(session != null){
            writer.println("Welcome "+session.getAttribute("username"));

        }
        writer.println("<a href=logout.html>Logout</a>\n");
    }
}
