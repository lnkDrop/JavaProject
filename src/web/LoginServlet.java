package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import dao.Md5;
import entity.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String md5password = request.getParameter("password");
		String password = Md5.getMD5String(md5password);
		User user = Dao.selectByName(username);
		if(user==null) {
			request.setAttribute("msg", "用户不存在");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			if(!password.equals(user.getPassword())) {
				request.setAttribute("msg", "密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				//登陆成功
				//从session中获取用户信息
				//创建session
				HttpSession ssion = request.getSession();
				//把数据绑定到session中
				ssion.setAttribute("user", user);
				//重定向到index页面
				response.sendRedirect("index.jsp");
			} 
		}
		
	}

}
