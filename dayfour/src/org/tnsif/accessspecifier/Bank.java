package org.tnsif.accessspecifier;

public class Bank {
   public String bankname;
   private int atmpin;
   long accno=657534321234L;
   
   public void display() {
	   System.out.println("Bank name is: "+bankname);
	   }
   private void displayprivate()
   {
	   System.out.println("pin no is:"+atmpin);
   }
   void displaydefault() {
	   System.out.println("Account no is:"+accno);
   }
}
