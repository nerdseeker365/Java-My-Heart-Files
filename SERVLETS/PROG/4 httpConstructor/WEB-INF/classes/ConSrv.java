import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class ConSrv extends HttpServlet
{
	public ConSrv()
	{
				System.out.println("Cons. exceuted");
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
			res.setContentType("text/html");

			Date d = new Date();

			String dd = d.toString();

			System.out.println("Requse Hashcode	"+req.hashCode());

			System.out.println("Responce Hashcode	"+res.hashCode());
			
			PrintWriter pw = res.getWriter();

			pw.println("<h1>HelloSrv</h1>");

			pw.println("<h2>DATE		:		</h2>"+dd);

			pw.close();


	}

	
	}
