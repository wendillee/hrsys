package com.atcuit.hrsystem.pojo;

public class Account {
	private Integer accountNum; //账号
	private String password;	//密码
	private boolean logged;		//是否为首次登陆
	private Integer gmlevel;		//账号权限

	@Override
	public String toString() {
		return "Account{" +
				"accountNum=" + accountNum +
				", password='" + password + '\'' +
				", logged=" + logged +
				", gmlevel=" + gmlevel +
				'}';
	}

	public Integer getAccountNum() {
		System.out.println("getAccountNum");
		return accountNum;
	}

	public void setAccountNum(Integer accountNum) {
		System.out.println("setAccountNum");
		this.accountNum = accountNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public Integer getGmlevel() {
		return gmlevel;
	}

	public void setGmlevel(Integer gmlevel) {
		this.gmlevel = gmlevel;
	}

	public Account(Integer accountNum, String password, boolean logged, Integer gmlevel) {
		this.accountNum = accountNum;
		this.password = password;
		this.logged = logged;
		this.gmlevel = gmlevel;
	}

	public Account() {
	}
}

