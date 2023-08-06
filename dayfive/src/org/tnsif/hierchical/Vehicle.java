package org.tnsif.hierchical;

public class Vehicle {
         private String model;
         private int size;
		public Vehicle(String model, int size) {
			super();
			this.model = model;
			this.size = size;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		@Override
		public String toString() {
			return "Vehicle [model=" + model + ", size=" + size + "]";
		}
         
}
