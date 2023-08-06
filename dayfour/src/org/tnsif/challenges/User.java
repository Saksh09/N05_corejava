package org.tnsif.challenges;

import java.util.Scanner;

/* Ask a user for their birth year encoded as two digit (like "62') and for the current year ,also encoded 
 * as two digit(99) .write a program to find user current age in years */
public class User {
	static void age(int birth,int cur) {
		if(cur>birth) {
			System.out.println(cur-birth);
		}
		else {
			System.out.println((100-birth)+cur);
		}
	}
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int birth=s.nextInt();
        int cur=s.nextInt();
        age(birth,cur);

	}

}
