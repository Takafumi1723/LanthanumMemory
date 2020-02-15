package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.RegisterAccountService;

@WebServlet("/Account")
public class Account extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("user_id");
		String password = request.getParameter("password");

		//DBに接続してアカウントテーブルに登録する
		try {
			RegisterAccountService.registerAccount(userName, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
