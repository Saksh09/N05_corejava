package org.tnsif.Exception;

import java.util.Scanner;

public class ArithmeticExc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=s.nextInt();
		int y=s.nextInt();
		
		try {
		System.out.println(x/y);

	}catch(Exception e) {
		System.out.println("Exception handled"+e);
	}

}
}