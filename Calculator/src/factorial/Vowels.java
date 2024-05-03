package factorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Vowels")
public class Vowels extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("jsp/Vowels.jsp").forward(request, response);
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String str = request.getParameter("name");
		request.setAttribute("name", str);
		
		int vCount = 0, cCount = 0;    
        str = str.toLowerCase();    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                vCount++;    
            } else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                cCount++;    
            }
        }    
        request.setAttribute("vowels", vCount);    
        //System.out.println("Number of consonants: " + cCount);    

		request.getRequestDispatcher("jsp/Vowels.jsp").forward(request, response);
	}

}
