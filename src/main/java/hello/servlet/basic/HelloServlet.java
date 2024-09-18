package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

@WebServlet(name="hello servlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + req);
        System.out.println("response = " + res);

        String username = req.getParameter("username");
        System.out.println("username = " + username);

        res.setContentType("text/plain");
        res.setCharacterEncoding("utf-8");
        Writer w = res.getWriter();
        w.write("hello " + username);
    }
}
