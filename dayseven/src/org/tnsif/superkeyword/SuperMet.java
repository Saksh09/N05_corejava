package org.tnsif.superkeyword;
class Sports{
	String sportname="Cricket";
	void display() {
		System.out.println("Sports name is"+sportname);
	}
}
class Cricket extends Sports{
	int number=11;
	void display() {
		/*if parent and child contains same method and if we want to call parent class method inside child
		then use super.methodname*/
		super.display();
		System.out.println("Sports number is"+number);
	}
}
public class SuperMet {

	public static void main(String[] args) {
	Cricket c= new Cricket();
	c.display();

	}

}
