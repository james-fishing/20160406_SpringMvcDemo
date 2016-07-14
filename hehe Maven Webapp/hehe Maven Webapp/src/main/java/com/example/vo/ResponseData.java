package com.example.vo;

public class ResponseData
{

	private String name;
	private String pwd;
	private boolean loginState;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}

	public boolean isLoginState()
	{
		return loginState;
	}

	public void setLoginState(boolean loginState)
	{
		this.loginState = loginState;
	}

}
