package org.tnsif.challenges;

public class Words {

	public static void main(String[] args) {
		String str="how are you doing";
		 System.out.println(str);
		 String find="are you";
		 int i=str.indexOf(find);
		 if(i>0)
			 System.out.println(str.substring(i,i+find.length()));
		 else
			 System.out.println("string not found");
	}

}
