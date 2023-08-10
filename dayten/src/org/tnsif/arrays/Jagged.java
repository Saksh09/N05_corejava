package org.tnsif.arrays;

import java.util.Scanner;

public class Jagged {

	public static void main(String[] args) {
		//in jagged array outside array is fixed but inside array size is different 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter");
		int arr[][]=new int[2][];
		
		//for outside array index 0,storing 3 elements and 1 storing 2 elements
		 arr[0]=new int[3];
		arr[1]=new int[2];
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		arr[i][j]=s.nextInt();
        	}
        }
    
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        }System.out.println();
		
	}

}
