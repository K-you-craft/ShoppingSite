package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.Users;
import jp.co.aforce.dao.UserDAO;

/**
 * Servlet implementation class Register
 */
@WebServlet(urlPatterns = { "/views/register"})
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		
		String member_id = request.getParameter("member_id");
		String last_name = request.getParameter("last_name");
		String first_name = request.getParameter("first_name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String mail_address = request.getParameter("mail_address");
		
		Users users = new Users();
		
		users.setMember_id(member_id);
		users.setLast_name(last_name);
		users.setFirst_name(first_name);
		users.setPassword(password);
		users.setAddress(address);
		users.setMail_address(mail_address);
		
		UserDAO dao = new UserDAO();
		try {
			
			int line = dao.insert(users);
			
			if(line != 1) {
				request.getRequestDispatcher("register-error.jsp").forward(request, response);
				return;
			}
			
			session.setAttribute("users",users);
			response.sendRedirect("register-success.jsp");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
