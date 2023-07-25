package org.tnsif.oops;

import java.util.Objects;

public class CitizenConstructor {
	


	String citizenType;
	long aadhar;
	String gender;
	String city;
	public CitizenConstructor() {
		System.out.println("Default Constructor");
		
	}
	
	//parameterised
	public CitizenConstructor(String citizenType, long aadhar, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadhar = aadhar;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "CitizenConstructor [citizenType=" + citizenType + ", aadhar=" + aadhar + ", gender=" + gender
				+ ", city=" + city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	


}
