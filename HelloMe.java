

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloMe")
public class HelloMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter writer=resp.getWriter();
	String data=req.getParameter("GOAT");
	resp.setContentType("text/html");
	writer.print("<h1><font color=green> Messi is the "+ data +" of Football</font></h1>");
}

}
