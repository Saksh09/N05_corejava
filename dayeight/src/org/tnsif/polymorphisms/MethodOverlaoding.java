package org.tnsif.polymorphisms;
class Bollywood{
	String s1;
	String s2;
	String s3;
	static void display(String s1,String s2) {
		System.out.println(s1+ " Loves " +s2);
		}
	 static void display(String s1,String s2 ,String s3) {
		System.out.println(s1+ " Loves " +s2+s3);
		}
}
public class MethodOverlaoding {
     
	public static void main(String[] args) {
		
		Bollywood.display("salman","aish");
		Bollywood.display("salman","aish","kat");
	}

}
