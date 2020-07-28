import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddNumbers extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));

		int sum = i + j;
		
		Cookie cookie =new Cookie("sum",sum+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
//		HttpSession session=req.getSession();			//session management
//		session.setAttribute("sum",sum);
//		res.sendRedirect("sq");
		
		
//		res.sendRedirect("sq?sum="+sum);			//URL rewriting
		

		
//		req.setAttribute("sum", sum);
		
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req,res);

		
//		PrintWriter out=res.getWriter(); 
//		out. println("sum of numbers is: "+sum);

	}
}
