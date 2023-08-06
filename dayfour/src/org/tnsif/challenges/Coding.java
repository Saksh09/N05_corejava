package org.tnsif.challenges;

import java.util.Scanner;

/*write a program to calculate  to hotel tariff.the room rent is 20% high during peak season(april-june)
 * (nov-dec)note-use the switch cases.
 * month=3
 * rent=1332
 * day=2*/

/*a microwave oven manufacturer recommends that when heating two items,and 15%to the heating time and
 * when heating items double the heating time.Heating more the 3 item at once is not recommended.write a proram
 * the recommended heating time
 * input
 * item-2
 * heating time=5.0*/
public class Coding {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int month=s.nextInt();
		float rent=s.nextInt();
		int day=s.nextInt();
		 switch(month) {
		 case 1:
		 case 2:
		 case 3:
		 case 7:
		 case 8:
		 case 9:
		 case 10:
			 System.out.println(rent*day);
			 break;
			 
		 case 4:
		 case 5:
		 case 6:
		 case 11:
		 case 12:
			 System.out.println((rent+(rent*0.2))*day);
			 break;
	     default:
	    	 System.out.println("Invalid month");
		 }
		
	}

}
