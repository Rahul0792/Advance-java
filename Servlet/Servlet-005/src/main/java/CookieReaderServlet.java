import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/cookies")
public class CookieReaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie[] = req.getCookies();
        PrintWriter writer = resp.getWriter();
            if(cookie != null){
              for(Cookie cookies : cookie){
                  writer.println(cookies.getName() + ": " + cookies.getValue());
              }
            }

    }
}
