import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class srv1 extends HttpServlet
{

	public   void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ServletConfig cg = getServletConfig();
		ServletContext sc = cg.getServletContext();

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		RequestDispatcher rd = sc.getRequestDispatcher("/s2");

		String s1 = req.getParameter("t1");

		int a = Integer.parseInt(s1);

		int b = a*a;

		pw.println("<h1>Before include		:	"+b+"</h1>");

		if(b>100)
		{
			pw.println("<h1>Sqare is--->		:	"+b+"</h1>");
		}

		else
		{
				rd.include(req,res);
		}

		pw.println("<h1> After include</h1>");
	
	}
	public   void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
			doGet(req, res);
	}

}