package org.tnsif.operator;

public class Logical {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println((5>3)&&(6==6));
		System.out.println((5>3)||(5==6));
		System.out.println(!(5>3)&&(6==6));
	}

}
