package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.LoginService;
import com.example.vo.RequestVO;
import com.example.vo.ResponseData;
import com.example.vo.ResponseVO;

@Controller
public class LoginController
{
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login.do", method = RequestMethod.POST, produces = "application/json; charset=UTF-8",headers="Aceept=application/json")
	public  @ResponseBody  ResponseVO loginCheck(@RequestBody RequestVO requestVO)
	{
		String nameString = requestVO.getData().getName();
		String pwdString = requestVO.getData().getPwd();

		ResponseVO dataVo = new ResponseVO();
		ResponseData responseData = new ResponseData();
		responseData.setName(nameString);
		responseData.setPwd(pwdString);
		responseData.setLoginState(loginService.validateUser(nameString, pwdString));
		dataVo.setData(responseData);
		dataVo.setResult(true);

		System.out.println(dataVo);
		return dataVo;
	}
	
	@RequestMapping(value = "/regist.do", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public @ResponseBody ResponseVO userRegist(@RequestBody RequestVO requestVO)
	{
		String nameString = requestVO.getData().getName();
		String pwdString = requestVO.getData().getPwd();

		ResponseVO dataVo = new ResponseVO();
		ResponseData responseData = new ResponseData();
		responseData.setName(nameString);
		responseData.setPwd(pwdString);
		responseData.setLoginState(loginService.userRegist(nameString, pwdString));
		dataVo.setData(responseData);
		dataVo.setResult(true);

		System.out.println(dataVo);
		return dataVo;
	}
}
