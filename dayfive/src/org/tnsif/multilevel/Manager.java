package org.tnsif.multilevel;

public class Manager {
      private String deptname;
      private String name;
      private int id;
	public Manager() {
		System.out.println("Default Constructor");
	}
	public Manager(String deptname, String name, int id) {
		super();
		this.deptname = deptname;
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Manager [deptname=" + deptname + ", name=" + name + ", id=" + id + "]";
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
      
	
	
}
