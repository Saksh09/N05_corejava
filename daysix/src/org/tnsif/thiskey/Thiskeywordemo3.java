package org.tnsif.thiskey;

public class Thiskeywordemo3 {
	int x;
	Thiskeywordemo3(){
		this(34);
		System.out.println("default");
		
	}
	Thiskeywordemo3(int x){
		this.x=x;
		System.out.println("parameterised"+x);
	}

	public static void main(String[] args) {
		Thiskeywordemo3 t=new Thiskeywordemo3();
	}

	
}
