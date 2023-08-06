package org.tnsif.faccessspecifierdemo;
import org.tnsif.accessspecifier.Bank;


public class BankExecuter {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.bankname="SBI";
		b.display();
		//b.atmpin we cant access it bcoz it is private
		
		//b.accno it is default we can access it in same package
	}

}
