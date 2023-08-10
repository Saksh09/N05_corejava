package org.tnsif.Exception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowExec {
	//throws declares a exception
	static void iseligible(int age,int weight) throws IOException {
		if(age>18 && weight>50) {
			System.out.println("Eligible");
		}
		else {
			throw new IOException("Age and weight criteria is not fulfilled");
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter");
		int age=s.nextInt();
		int weight=s.nextInt();
		iseligible(age,weight);
		
	}

}
