package com.springboot.app.vo;

public class IsinVO {

	private int secCode;

	private int secType;

	private String isin;

	public IsinVO() {

	}

	public IsinVO(int secCode, int secType, String isin) {
		super();
		this.secCode = secCode;
		this.secType = secType;
		this.isin = isin;
	}

	public int getSecCode() {
		return secCode;
	}

	public int getSecType() {
		return secType;
	}

	public String getIsin() {
		return isin;
	}

}
