package org.tnsif.challenges;
/* pratik is so much in gardening and hence he plant more trees in his garden.he plants trees in rectangular fashion
 * with the order of rows and column and number the trees in a row wise order.he panted a mango tree only in the first
 * row first column and last column.so ,given the tree number and rows and column yor task is to find out wh
 * w
 * 
 * eather the given tree is mango or not.
 * N=5 ,t=11 tree no,*/

import java.util.Scanner;


public class MangoTree {
	static void ismagotree(int n,int t) {
	if(t%n==0 || t%n==1 || t<=n) {
    	System.out.println("It is a mango tree");
    }
    else {
    	System.out.println("Not a mango tree");}
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int t=s.nextInt();
        ismagotree(n,t);
        }
	}


