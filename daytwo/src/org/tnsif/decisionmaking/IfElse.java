package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age:");
		int Age=sc.nextInt();
		System.out.println("Enter your weigth:");
		int weigth=sc.nextInt();
		if((Age>=18)&&(weigth>=50)) {
		System.out.println("You are eligible to donate blood");
		}
	else {
		System.out.println("You are not eligible to donate blood");
	}

	}



}
