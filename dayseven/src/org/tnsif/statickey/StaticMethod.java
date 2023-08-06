package org.tnsif.statickey;

public class StaticMethod {
	    int x=2;
        static int age=10;
         
    //access method using static keyword
    static void display() {
    	System.out.println(age);
    	//System.out.println(x);
    }
	public static void main(String[] args) {
		
		display();

	}
}
//we cant override static method also super is not used in static block only child class is printed