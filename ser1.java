

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ser1")
public class ser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	out.print("servlet 1");
	
	int empId=Integer.parseInt(request.getParameter("empid"));
	int empAge=Integer.parseInt(request.getParameter("empAge"));
	String empName=request.getParameter("empName");
	String empAddress=request.getParameter("empAddress");
	//String svar=request.getParameter("somedata");
	//out.print("Sessiondata"+svar+"<br>");
	//String appvar=request.getParameter("appData");
	//Sout.print("Sessiondata"+appvar+"<br>");
	Employee employee=new  Employee(empId, empAge, empName, empAddress);
	HttpSession session= request.getSession();
	session.setAttribute("emp",employee);

out.print(empId);
out.print(employee.getEmpName());

//ServletContext context= request.getServletContext();
//context.setAttribute("appVar",appvar);

	out.print("<form action='ser2'>");	
	out.print("<input type='submit'>");
	out.print("</form>");
	}
}
