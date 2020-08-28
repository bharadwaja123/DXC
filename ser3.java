

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ser3")
public class ser3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

		HttpSession session= request.getSession();
		//String data=(String)session.getAttribute("sVar");

		Employee employee=(Employee)session.getAttribute("emp");

		//ServletContext context=request.getServletContext();
        //String data1=context.getAttribute("appVar").toString();

		out.print("servlet 3");
		out.print(employee);
		////out.print("<br>");
		//out.print("Application data "+data1);

		}


	}

