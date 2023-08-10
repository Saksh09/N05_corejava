package org.tnsif.Exception;

import java.util.Scanner;

public class FinnalyNotExec {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=s.nextInt();
		int y=s.nextInt();
		try {
			System.out.println(x/y);
			System.exit(0);

		}catch(Exception e) {
			System.out.println("Exception handled"+e);
			//System.exit(0); finally block will not executed
		}
		finally {
			//System.out.println(4/0);it contains exception it will not execute
			System.out.println("alwasy executed");
		}

	}

}
