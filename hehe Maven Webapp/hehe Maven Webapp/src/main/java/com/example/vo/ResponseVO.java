package com.example.vo;

public class ResponseVO
{
	private ResponseData data;
	private boolean result;

	public ResponseData getData()
	{
		return data;
	}

	public void setData(ResponseData data)
	{
		this.data = data;
	}

	public boolean isResult()
	{
		return result;
	}

	public void setResult(boolean result)
	{
		this.result = result;
	}

}
