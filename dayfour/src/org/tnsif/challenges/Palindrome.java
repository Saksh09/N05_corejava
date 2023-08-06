package org.tnsif.challenges;

public class Palindrome {
static void f(int i,String s) {
	boolean value=true;
	
	for( int k=0;k<=i;k++) {
		if(s.charAt(k)!=s.charAt(i-k-1)) 
	
		value= false;
		
	else 
		System.out.print("palindome");
		value=true;

	
}
	
}
	
	
	public static void main(String[] args) {
		String s="abbbabbbba";
		int i=s.length();
		System.out.println(f(i,s));

	}

}
