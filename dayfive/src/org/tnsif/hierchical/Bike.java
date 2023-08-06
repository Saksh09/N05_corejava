package org.tnsif.hierchical;

public class Bike extends Vehicle {
       private int id;
       private String wheels;
       
	public Bike(int id, String wheels,String model,int size) {
		super(wheels, id);
		this.id = id;
		this.wheels = wheels;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	

	@Override
	public String toString() {
		return "Bike [id=" + id + ", wheels=" + wheels + ", toString()=" + super.toString() + "]";
	}
	

}
