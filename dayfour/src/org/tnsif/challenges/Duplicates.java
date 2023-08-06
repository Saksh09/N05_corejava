package org.tnsif.challenges;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;

//public class Duplicates {
//  static String duplicate(char str[],int length) {
//	  int index=0;
//	  for(int i=0;i<length;i++) {
//		  int j;
//		  for( j=0;j<i;j++) {
//			  if(str[i]==str[j]) {
//				  break;
//			  }
//		  }
//		  if(j==i) {
//			  str[index++]=str[i];
//		  }
//	  }
//	  return String.valueOf(Arrays.copyOf(str,index));
//  }
//	public static void main(String[] args) {
//		char str[]="sakshiautade".toCharArray()
//;
//		int n=str.length;
//		System.out.println(duplicate(str,n));
//				}
//
//}

//using hashing

public class Duplicates{
	static void sen(String str) {
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
			
			for(Character ch:set) 
				System.out.println(ch);}
		}
	public static void main(String[] args) {
		String str="sakshiauattde";
		
		sen(str);
				
	}
}