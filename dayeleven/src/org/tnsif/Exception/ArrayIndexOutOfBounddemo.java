package org.tnsif.Exception;

public class ArrayIndexOutOfBounddemo {
	static void print(int arr[]) {
		try {
		System.out.println(arr[3]);
		}
		catch(Exception e) {
			System.out.println("Exception handled"+e);
		}
		//always executed
		finally {
			System.out.println(arr[0]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3};
	     print(arr);

	}

}
