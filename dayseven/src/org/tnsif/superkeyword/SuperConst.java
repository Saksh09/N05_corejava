package org.tnsif.superkeyword;
class Nationality{
	String nation;

	public Nationality(String nation) {
		
		this.nation = nation;
		System.out.println(nation);
	}
	
}
class Person extends Nationality{
	String language;
//call parent class constructor
	
	public Person(String nation, String language) {
		super(nation);
		this.language= language;
		System.out.println(language);
	}

		
	
}
public class SuperConst {

	public static void main(String[] args) {
		Person p=new Person("Germany","German");
		

	}

}
