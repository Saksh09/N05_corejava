package org.tnsif.superkeyword;
class State{

	String statename="punjab";
    
	
}
class Capital extends State{

	String statename="haryana";
	
	String capital="chandigarh";
	
	 public void display() {
    	 System.out.println(super.statename);
    	 System.out.println(statename);
     }
}
public class SuperVar {

	public static void main(String[] args) {
		Capital c=new Capital();
		c.display();

	}

}
