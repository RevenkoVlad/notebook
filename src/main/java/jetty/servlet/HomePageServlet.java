package jetty.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/home")
public class HomePageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            out.println("<html><head><title>MyServlet</title>VLAD, ZDAROVA</head>ZDAROVA<body>");
            out.write(getServletConfig().getInitParameter("webInitParam1") + " ");
            out.write(getServletConfig().getInitParameter("webInitParam2"));
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            out.println("<html><head><title>MyServlet</title></head>DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD<body>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
