package org.tnsif.thiskey;

public class Thiskeywordemo2 {
     void print(Thiskeywordemo2 t) {
    	 System.out.println("hey there");
     }
     void display() {
    	 print(this);
     }
	public static void main(String[] args) {
		Thiskeywordemo2 t=new Thiskeywordemo2();
		t.display();

	}

}
