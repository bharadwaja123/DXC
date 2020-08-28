

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.security.Init;

@WebServlet("/sevletHit")
public class sevletHit extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    private int hit;
    public  void Init()
    {
    	hit=0;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		hit++;
		PrintWriter out=response.getWriter();
	     String t="no of hits";
	   out.print("<h3>"+t+""+hit+"</h3");
	}
}
