package convert;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Percentage")
public class Percentage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Percentage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/Percentage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  int subject1 = Integer.parseInt(request.getParameter("subject1"));
	        int subject2 = Integer.parseInt(request.getParameter("subject2"));
	        int subject3 = Integer.parseInt(request.getParameter("subject3"));
	        int subject4 = Integer.parseInt(request.getParameter("subject4"));
	        int subject5 = Integer.parseInt(request.getParameter("subject5"));

	        // Calculate total marks and percentage
	        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
	        double percentage = (totalMarks / 5.0);
	        request.setAttribute("percentage", percentage);
		request.getRequestDispatcher("jsp/Percentage.jsp").forward(request, response);	
	}

}
