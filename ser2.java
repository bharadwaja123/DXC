

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ser2")
public class ser2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

		HttpSession session= request.getSession();
		Employee employee=(Employee)session.getAttribute("emp");
		//String data=(String)session.getAttribute("sVar");
		//String data=session.getAttribute("sVar").toString();
		//session.setMaxInactiveInterval(5);
       // ServletContext context=request.getServletContext();
       // String data1=context.getAttribute("appVar").toString();

		out.print("servlet 2");
		out.print(employee.getEmpName());
		//out.print("<br>");
		//out.print("Application data "+data1);
		out.print("<form action='ser3'>");
		out.print(" <input type='submit'>");
		out.print(" </form>");


	}

}
