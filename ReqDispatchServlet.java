import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/dispatchForm")
public class ReqDispatchServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String myName = req.getParameter("name1");
        String myEmail = req.getParameter("email1");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        if(myName.equals("Deepak") && myEmail.equals("deepak@gmail.com")){
            RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
            rd.forward(req, resp);
        }else{
            out.println("Incorrect name or email. Try again.");

            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req, resp);
        }

    }
}
