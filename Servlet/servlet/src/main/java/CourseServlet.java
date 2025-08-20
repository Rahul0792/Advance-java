import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
@WebServlet("/courses")
public class CourseServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Init");
    }
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        try {
            CourseDao courseDao = new CourseDao();
            List<Course> courses = courseDao.getAllCourses();

            PrintWriter writer = response.getWriter();
            writer.println("List Of Courses:");
            writer.println(courses);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Database error occurred", e);
        }
    }
    @Override
    public void destroy() {
        System.out.println("Destroy");

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
