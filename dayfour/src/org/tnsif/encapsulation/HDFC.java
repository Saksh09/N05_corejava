package org.tnsif.encapsulation;

public class HDFC {
     private long accno;
     private int cvv;
     private String acctype;
     private int pin;
     
     //getter and setter
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "HDFC [accno=" + accno + ", cvv=" + cvv + ", acctype=" + acctype + ", pin=" + pin + ", getAccno()="
				+ getAccno() + ", getCvv()=" + getCvv() + ", getAcctype()=" + getAcctype() + ", getPin()=" + getPin()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
     
     
	
	
	
}
