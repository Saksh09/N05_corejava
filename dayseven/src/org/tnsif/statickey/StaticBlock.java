package org.tnsif.statickey;

public class StaticBlock {
       static int salary;
       String company;
      //static block is used to initialize static variable 
       static {
    	   //non
    	   static variable
    	// company="TATA";
    	 salary=1232143;
    	   
    	   
       }
      static void print() {
    	  System.out.println(salary);
       }
       
	public static void main(String[] args) {
		print();
	}

}
