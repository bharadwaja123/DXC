

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	PrintWriter out=resp.getWriter();
    	String data=req.getParameter("let's party");
    	resp.setContentType("text/html");
    	out.print("<h1><font color=red>Hello bro " + data +" and chill!!</font><h1>");
  
    	String []ar=req.getParameterValues("languages");
    	for(String a:ar)
    	{
    		out.print(a+"<br>");
    	}
    }
}
