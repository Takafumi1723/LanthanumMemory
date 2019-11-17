package service;

import model.User;

public class LoginService {

	/**
	 * ログインの認証処理
	 */
	public boolean executeLogin(User user)
	{
		if(user.getUserName().equals("test") && user.getPass().equals("1234"))
		{
			return true;
		}
		return false;
	}

}
