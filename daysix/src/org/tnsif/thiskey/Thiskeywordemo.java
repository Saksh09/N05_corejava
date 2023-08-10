package org.tnsif.thiskey;

public class Thiskeywordemo {
	int x,y;
	public Thiskeywordemo(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	
	void display() {
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		Thiskeywordemo t=new Thiskeywordemo(1,2);
		t.display();

	}}

