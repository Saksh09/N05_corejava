package org.tnsif.polymorphisms;

import java.util.Scanner;

class Laptop{
	int Ram;
	
	 void specification(int Ram) {
		System.out.println("Ram is :" +Ram);
	}
}
class Dell extends Laptop{
int Ram2;
	
	 void specification(int Ram2,int Ram) {
		super.specification(Ram);
		System.out.println("Dell is :" +Ram2 +"Ram");
	}
	
}
public class MethodOverride {

	public static void main(String[] args) {
		Dell d=new Dell();
		Scanner s=new Scanner(System.in);
		int Ram=s.nextInt();
		int Ram2=s.nextInt();
		
		d.specification(Ram,Ram2);
		
	}

}
