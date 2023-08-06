package org.tnsif.finalkey;


public class Waiter extends Chef {

	final String chefhotel="JW";
	//cannot override final method
//	 void print() {
//		System.out.println(chefhotel);
//	}

		private void display() {
			System.out.println(chefhotel);
		}


    
	public static void main(String[] args) {
		Waiter w=new Waiter();
		w.display();
		w.print();
		
	}

}