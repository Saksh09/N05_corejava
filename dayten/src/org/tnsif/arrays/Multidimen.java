package org.tnsif.arrays;

import java.util.Scanner;

public class Multidimen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter");
		int arr[][]=new int[3][2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();}
	}

}
