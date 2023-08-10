package org.tnsif.CustomExec;

import java.util.Scanner;

public class LoginExec {

	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mail");
		String email=s.nextLine();
		String password=s.nextLine();
		//equals check every character in upper case or lower case
		try {
		if(email.equals("sakshi@gmail.com")&& password.equals("Pass@123")) {
			System.out.println("Credential matched");
			
		}
		else {
			throw new LoginCreditals("Invalid Creddentials");
		}
	}catch(LoginCreditals e) {
		System.out.println(e);
	}

}}
