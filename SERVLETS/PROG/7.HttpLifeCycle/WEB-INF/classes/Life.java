import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Life extends HttpServlet
{

		public Life()
		{
				System.out.println("1.0 param");
		}

		public void init(ServletConfig cg)
		{
				System.out.println("2.intilize");
		}


	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
	
			res.setContentType("text/html");

			Date d = new Date();

			String dd = d.toString();

			PrintWriter pw = res.getWriter();

			pw.println("<h1>HelloSrv</h1>");

			pw.println("<h2>DATE		:		</h2>"+dd);

		System.out.println("3.Servce");
	}

		public void destroy()
		{
						System.out.println("4. Destroy");
		}

	
	}
