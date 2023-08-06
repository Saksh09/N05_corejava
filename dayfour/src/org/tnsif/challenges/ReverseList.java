package org.tnsif.challenges;

public class ReverseList {
	
	
public static void f(int arr[],int n) {
	int i;
	if(i>=n/2)
		return ;
	swap(arr[i],arr[i-n-1]);
	f(i+1,n-1);
	}
		

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int n=arr.length;
		f(0,5);
	}
//		String name="sakshi",rvs="";
//		char ch;
//		System.out.println("original word");
//		System.out.println("sakshi");
//
//		for(int i=0;i<name.length();i++) {
//			ch=name.charAt(i);
//			rvs=ch+rvs;
//			
//		}
//		System.out.println("Reserved word:  "+ rvs);
//	
//	}

}
