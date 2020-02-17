package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class LoginService {

	/**
	 * 入力されたログイン名とパスワードがDBに登録されているか判定を行う
	 * true:ログイン成功
	 * false:再入力
	 * @throws ClassNotFoundException
	 */
	public boolean executeLogin(User loginUser) throws ClassNotFoundException
	{
		String url = "jdbc:postgresql://localhost:5432/test";
		String user = "takafumi";
		String pass = "taka1224";

		try{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT NAME, PASSWORD FROM LM_ACCOUNTS;";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet result = pstm.executeQuery();
			while(result.next())
			{
				if(loginUser.getUserName().equals(result.getString("name")) && loginUser.getPass().equals(result.getString("password")))
				{
					return true;
				}
			}
			return false;
		}catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}

}
