package model;

public class User {

	private String userName;
	private String pass;

	public User()
	{
	}

	public User(String userName, String pass)
	{
		this.userName = userName;
		this.pass = pass;
	}

	public String getUserName()
	{
		return userName;
	}
	public String getPass()
	{
		return pass;
	}

}
