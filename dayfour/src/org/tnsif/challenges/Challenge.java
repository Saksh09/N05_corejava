
package org.tnsif.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*there are n people standing in a circle waiting to be executed.the counting out begins
 *  at some point in a circle and proscete around a circle in fixed direction. in each step a certain number
 *  of people are skipped and the next person is executed.the elimination proscete around the circle
 * (which is becoming smaller and smaller as the executed people are removed),until only the last person
 * remains,who is given freedom.
 *       given the total no of person n and number k which indicated that k-1 person are skipped and the 
 *       kth person is killed in a circle.the task is to choose the 
 *       kth person in the initial circle that survives.
 *       n=10; k=2
 *       
 *       */

public class Challenge {
	static int People(int n,int k) {
		if(n==1) {
			
			return 1;
			}
		else {
			return(People(n-1,k)+k-1)% n +1;
		}
			
			
		}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int k=s.nextInt();

		People(n,k);
	}
}
