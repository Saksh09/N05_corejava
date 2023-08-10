package org.tnsif.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arraymax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements");
		int n=s.nextInt();
				
		int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			System.out.println("arrays are");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
				
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("largest element is :"+max);
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
