package org.tnsif.CustomExec;

public class LoginCreditals extends Exception {
	
	private String str;
	 //getters and setters
    public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	//constructor
	public LoginCreditals(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "LoginCreditals [str=" + str + "]";
	}
	
	

}
