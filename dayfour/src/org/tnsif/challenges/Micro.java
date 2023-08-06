package org.tnsif.challenges;
/*a microwave oven manufacturer recommends that when heating two items,and 15%to the heating time and
 * when heating items double the heating time.Heating more the 3 item at once is not recommended.write a proram
 * the recommended heating time
 * input
 * item-2
 * heating time=5.0*/

import java.util.Scanner;

public class Micro {

	public static void main(String[] args) {
           Scanner  s=new Scanner(System.in);
           int item=s.nextInt();
           float ht=s.nextFloat();
           switch(item)
           {
           case 1:
           System.out.println(ht);
           break;
           case 2:
               System.out.println((ht/2)+ht);
               break;
           case 3:
               System.out.println(2*ht);
               break;
               default:
            	   System.out.println("Not recommended");
            	   break;
               
               
           }

	}

}
