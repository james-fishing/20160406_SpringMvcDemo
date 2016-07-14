package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean isUserExist(String name, String pwd)
	{
		String sql = "SELECT * FROM login_tab WHERE name=? AND pwd=?";

		if (jdbcTemplate.queryForList(sql, new Object[]
		{ name, pwd }).size() != 0)
		{
			return true;
		}
		return false;

	}

	public boolean isUserRegistSuccess(String name, String pwd)
	{
		String sql = "INSERT INTO login_tab (name,pwd)VALUES(?,?)";
		try
		{
			jdbcTemplate.update(sql, new Object[]
			{ name, pwd });
			return true;
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return false;

	}
}
