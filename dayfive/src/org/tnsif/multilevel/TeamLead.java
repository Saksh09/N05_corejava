package org.tnsif.multilevel;

public class TeamLead extends Manager {
	private String leadname;
	private int empid;
	private String projectname;
	public String getLeadname() {
		return leadname;
	}
	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public String toString() {
		return "TeamLead [leadname=" + leadname + ", empid=" + empid + ", projectname=" + projectname + ", toString()="
				+ super.toString() + "]";
	}
	public TeamLead() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamLead(String deptname, String name, int id,String leadname,int empid,String projectname) {
		super(deptname, name, id);
		this.empid=empid;
		this.leadname=leadname;
		this.projectname=projectname;
		// TODO Auto-generated constructor stub
	}
	
	
	
 
}
