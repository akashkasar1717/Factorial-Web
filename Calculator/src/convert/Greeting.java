package convert;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Greeting")
public class Greeting extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Greeting() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      	String greeting;
	        LocalTime currentTime = LocalTime.now();
	        if (currentTime.isBefore(LocalTime.NOON)) {
	            greeting = "Good morning";
	        } else if (currentTime.isBefore(LocalTime.of(17, 0))) {
	            greeting = "Good afternoon";
	        } else {
	            greeting = "Good evening";
	        }
	        request.setAttribute("greeting", greeting);
		request.getRequestDispatcher("jsp/Greeting.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
