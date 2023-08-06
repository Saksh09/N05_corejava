package org.tnsif.hierchical;

public class Car extends Vehicle{
	private String type;
	private String color;
	public Car(String model, int size, String type, String color) {
		super(model, size);
		this.type = type;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", color=" + color + ", toString()=" + super.toString() + "]";
	}
	

}
