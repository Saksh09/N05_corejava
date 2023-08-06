package org.tnsif.challenges;



public class Ab {
	public static int counta(String input) {
		int count=0;
		boolean value=false;
		for(int i=0;i<input.length();i++) {
			char currentchar=input.charAt(i);
			
			if (currentchar=='b') {
				value=true;
			}
			else if(value || currentchar=='a'){
				
				count++;
			}
		}return count;
	}

	public static void main(String[] args) {
		System.out.println(counta("babbbaaabbaaa"));

	}

}



