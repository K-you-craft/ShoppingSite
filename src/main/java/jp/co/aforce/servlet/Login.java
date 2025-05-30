package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.dao.UserDAO;

/**
 * Servlet implementation class Login_In
 */
@WebServlet(urlPatterns = { "/views/login-in" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();

		String member_id = request.getParameter("member_id");
		String password = request.getParameter("password");

		UserDAO dao = new UserDAO();

		try {

			String fullName = dao.getName(member_id, password);

			if (fullName == null) {
				request.getRequestDispatcher("login-error.jsp").forward(request, response);
			}

			
			session.setAttribute("fullName", fullName);
			response.sendRedirect("user-menu.jsp");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}