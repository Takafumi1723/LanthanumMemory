package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterAccountService {
	public static void registerAccount(String userName, String password) throws ClassNotFoundException
	{
		//接続文字列
		String url = "jdbc:postgresql://localhost:5432/test";
		String user = "takafumi";
		String pass = "taka1224";

		try{
			//ドライバーを準備
			Class.forName("org.postgresql.Driver");
			//postgresqlへ接続
			Connection conn = DriverManager.getConnection(url, user, pass);
			//insert文を用意
			String sql = "INSERT INTO LM_ACCOUNTS (name, password) VALUES('" + userName + "', '" + password+ "');";
			PreparedStatement pstm = conn.prepareStatement(sql);
			//insert文を実行
			pstm.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
