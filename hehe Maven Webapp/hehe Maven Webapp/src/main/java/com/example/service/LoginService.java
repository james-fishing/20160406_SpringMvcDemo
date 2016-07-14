package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LoginDao;

@Service
public class LoginService
{
	@Autowired
	private LoginDao loginDao;

	/** 验证用户 */
	public boolean validateUser(String name, String pwd)
	{

		return loginDao.isUserExist(name, pwd);
	}

	/** 新增用户 */
	public boolean userRegist(String name, String pwd)
	{
		return loginDao.isUserRegistSuccess(name, pwd);
	}
}
