package factorial;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Staff")
public class Staff extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String jdbcUrl = "jdbc:postgresql://localhost:5432/askme";
		String dbUsername = "postgres";
		String dbPassword = "askme123";

		String sql = "SELECT * FROM users";
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery();) {
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h2>Staff Details</h2>");
			out.println("<table border='1'>");
			out.println("<tr><th>Staff Number</th><th>Name</th><th>phone</th><th>email</th></tr>");

			while (resultSet.next()) {
				int sno = resultSet.getInt("id");
				String sname = resultSet.getString("name");
				String phone = resultSet.getString("phone");
				String email = resultSet.getString("email");

				out.println("<tr><td>" + sno + "</td><td>" + sname + "</td><td>" + phone + "</td><td>" + email
						+ "</td></tr>");
			}
			out.println("</table>");
			out.println("</body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("jsp/Staff.jsp").forward(request, response);
	}

}
