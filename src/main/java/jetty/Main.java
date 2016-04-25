package jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {

    public static void main(String[] args) throws Exception {
//        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();
//        HomePageServlet homePageServlet = new HomePageServlet();
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
//        WebAppContext webContext = new WebAppContext();
//        webContext.setContextPath("/");
//        webContext.setExtraClasspath("E:\\Projects\\notebook\\src\\main\\java");


//        context.addServlet(new ServletHolder(homePageServlet), "/home");
//        context.addServlet(new ServletHolder(allRequestsServlet), "/");

            Server jetty = new Server(8080);

        jetty.setHandler(context);


        jetty.start();
        jetty.join(); //join main thread to jetty's ThreadPool
    }
}
