package org.tnsif.singleinheritance;

public class Citizen {
  private String city;
  private int pincode;
  private long aadharNo;
  private long contactno;
  
  public Citizen() {
	System.out.println("default ");
	// TODO Auto-generated constructor stub
}
//parameterized
public Citizen(String city, int pincode, long aadharNo, long contactno) {
	super();
	this.city = city;
	this.pincode = pincode;
	this.aadharNo = aadharNo;
	this.contactno = contactno;
	System.out.println("Parameterized");
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
public long getContactno() {
	return contactno;
}
public void setContactno(long contactno) {
	this.contactno = contactno;
}
@Override
public String toString() {
	return "Citizen [city=" + city + ", pincode=" + pincode + ", aadharNo=" + aadharNo + ", contactno=" + contactno
			+ "]";
}
  
	

}
