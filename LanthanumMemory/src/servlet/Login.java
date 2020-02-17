package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import service.LoginService;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//確認用にコンソールに出力
		String userName = request.getParameter("user_id");
		String pass = request.getParameter("password");
		System.out.println(userName);
		System.out.println(pass);

		//ユーザ名とパスワードの認証
		User user = new User(userName, pass);
		LoginService ls = new LoginService();
		boolean loginResult = ls.executeLogin(user);

		if(loginResult)
		{
			//ログインが可能なユーザをセッションスコープに保存する
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);

			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/loginFail.jsp");
			dispatcher.forward(request, response);
		}

	}

}
