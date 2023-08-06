package org.tnsif.challenges;

public class MultiplicationWithout {
      public static int multiloop(int a,int b) {
		int result=0;
	for(int i=0;i<a;i++) { //if i=1 and a is 5 1<5,now i becomes 2
			result+=b; //7 next time 14 ,21,28 next 35
		}
    	  return result;
      }
      public static void main(String[] args) {
    	  System.out.println(multiloop(5,7));
      }
}
	
//loop give carry till a and b will be added each time to new result
