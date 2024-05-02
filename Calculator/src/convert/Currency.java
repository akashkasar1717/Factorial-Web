package convert;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Currency")
public class Currency extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Currency() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/Convert.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numberStr = request.getParameter("number");
		String selectedVal = request.getParameter("myvalue");
		int number = Integer.parseInt(numberStr);
		double curr= covertToDoller(number , selectedVal);
		request.setAttribute("selected", selectedVal);
	    request.setAttribute("curr", curr);
		request.getRequestDispatcher("jsp/Convert.jsp").forward(request, response);
	}

	private double covertToDoller(int number, String selectedVal) {
		double currs = 0;
		if(selectedVal.equalsIgnoreCase("doller")) {
			currs = number/83;
		}else if(selectedVal.equalsIgnoreCase("pound")) {
			currs = number/105;
		}else if(selectedVal.equalsIgnoreCase("euro")) {
			currs = number/115;
		}
		return currs;
	}

}
