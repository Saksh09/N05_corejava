package org.tnsif.operator;

public class Increment {

	public static void main(String[] args) {
		int x=12;
		int y=7;
		x=++y;
		y=x++;
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
