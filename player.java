

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/player")
public class player extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

String playerNames="rohit,rahul,virat,dk,hardik,kedar";

HttpSession session= request.getSession();
session.setAttribute("playerList", playerNames);

RequestDispatcher rd= request.getRequestDispatcher("jstl1.jsp");
rd.forward(request, response);


		//ArrayList<String> studNames=new ArrayList<>();

	/*	studNames.add("Raj");
		studNames.add("Ram");
		studNames.add("Raja");
		studNames.add("Ramu");
		studNames.add("Raman");
		studNames.add("Rama");

		HttpSession session= request.getSession();

		session.setAttribute("studList", studNames);

		RequestDispatcher rd= request.getRequestDispatcher("jstl1.jsp");
		rd.forward(request, response);
*/
		
}}
