package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		int weigth=sc.nextInt();
		
		int heigth=sc.nextInt();
		if(age>weigth && age>heigth)
		
		{
			System.out.println("Age is greater"+age);
		}
		else if(weigth>age && weigth>heigth) 
		{
			System.out.println("weigth is greater"+weigth);
		}
		else {
			System.out.println("Heigth is greater"+heigth);
		}
	}

}
