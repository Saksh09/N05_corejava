package org.tnsif.encapsulation;

public class encapsuationdemo {

	public static void main(String[] args) {
	HDFC h=new HDFC();
	h.setAccno(2613457548193L);
	h.setAcctype("Current");
	h.setCvv(233);
	h.setPin(1234);
	
	//getter only returns value if sysout is printed
//    System.out.println(h.getAccno());
//    System.out.println(h.getAcctype());
//    System.out.println(h.getCvv());
//    System.out.println(h.getPin());
	  System.out.println(h);
	}

	
	}



