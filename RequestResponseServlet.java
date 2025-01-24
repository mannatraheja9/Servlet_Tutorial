import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;


@WebServlet("/forms")
public class RequestResponseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String myName = req.getParameter("name1");
        String myEmail = req.getParameter("email1");

        System.out.println(myName + myEmail);

        PrintWriter outs =  response.getWriter();
        outs.print(myName);
        outs.print(myEmail);

    }
}
