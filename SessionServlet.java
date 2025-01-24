import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/sessionForm")
public class SessionServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String myEmail = req.getParameter("email");
        String myPassword = req.getParameter("password");
        resp.setContentType("text/html");
        if(myEmail.equals("deepak@gmail.com") && myPassword.equals("deepak123")){
            HttpSession session = req.getSession();
            session.setAttribute("name_key", "Deepak Panwar");
            RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
            rd.forward(req, resp);
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.forward(req, resp);
        }
    }
}
