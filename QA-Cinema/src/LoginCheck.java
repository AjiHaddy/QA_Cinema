import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//check with the database whether the username is valid or invalid
	
	
	String Username= request.getParameter("username");
	String Password= request.getParameter("password");
	
	if(Username.equals("java") && Password.equals("1234"))
			
			{
		response.sendRedirect("Member.jsp");
		request.setAttribute("username",Username);
			}
	else
		
	{
		response.sendRedirect("error.jsp");
	}
	}

}