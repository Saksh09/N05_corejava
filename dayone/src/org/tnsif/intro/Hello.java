package org.tnsif.intro;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// Program to demonstrate user input
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int num=sc.nextInt();
//		System.out.print("The value of num is:" + num);
  
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Number");
//		float num1=sc.nextFloat();
//		System.out.print("The value of float num1 is:" + num1);
		
//		System.out.println("Enter the Char");
//		char c=sc.next().charAt(0);
//		System.out.print("The value of char is:" + c);
		
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.print("The value of String is:" + str);
	}

}
