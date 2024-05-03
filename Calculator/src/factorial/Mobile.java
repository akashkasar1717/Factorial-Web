package factorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mobile")
public class Mobile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("jsp/Mobile.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mobileNumber = request.getParameter("mobileNumber");
		String regex = "\\d{10}";
        boolean isValid = mobileNumber.matches(regex);
        request.setAttribute("isValid", isValid);
		request.getRequestDispatcher("jsp/Mobile.jsp").forward(request, response);
	}

}
