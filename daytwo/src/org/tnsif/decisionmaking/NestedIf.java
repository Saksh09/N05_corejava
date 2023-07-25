package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=12 ) {
			if(weight>=40 ) {
				System.out.println("Eligible");
			
			if(weight>=100) {
				System.out.println("Extra ropes");
			}
		}
			else {
				System.out.println("Not Eligible");
			}
		}
		else {
			System.out.println("not Eligible");
		}
		

	}

}
