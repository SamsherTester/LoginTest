package com.testcases;

public class User {

	private String uName;
	private String pwd;
	private String age;

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [uName=" + uName + ", pwd=" + pwd + ", age=" + age + "]";
	}
}
