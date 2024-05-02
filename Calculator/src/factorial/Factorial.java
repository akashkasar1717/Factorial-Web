package factorial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class Factorial extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public Factorial() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/factorial.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");

      String numberStr = request.getParameter("number");
      int number = Integer.parseInt(numberStr);
      long factorial = calculateFactorial(number);

      request.setAttribute("number", number);
      request.setAttribute("factorial", factorial);
      
      request.getRequestDispatcher("jsp/factorial.jsp").forward(request, response);

	}
	private long calculateFactorial(int n) {
        if (n == 0)
            return 1;
        return n * calculateFactorial(n - 1);
    }

}
