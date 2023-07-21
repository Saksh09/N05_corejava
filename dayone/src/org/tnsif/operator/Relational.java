package org.tnsif.operator;
import java.util.Scanner;
public class Relational {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the num");
		int x=obj.nextInt();
		int y=obj.nextInt();
		System.out.println(x==y);
		System.out.println(x!=y);
		
	}

}
