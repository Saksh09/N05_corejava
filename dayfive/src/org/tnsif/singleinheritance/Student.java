package org.tnsif.singleinheritance;

public class Student extends Citizen{
	private int rollno;
   private String collegename;
   
public Student() {
	super();//constructor
	System.out.println("Default child class");
}
public Student(String city, int pincode, long aadharNo, long contactno,int rollno,String collegename) {
	super(city, pincode, aadharNo, contactno);
	this.rollno=rollno;
	this.collegename=collegename;
	// TODO Auto-generated constructor stub
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getCollegename() {
	return collegename;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", collegename=" + collegename + ", toString()=" + super.toString() + "]";
}
}
