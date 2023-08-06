package org.tnsif.multilevel;

public class TeamMember extends TeamLead {
	
	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamMember(String deptname, String name, int id, String leadname, int empid, String projectname,int duration,int sizeofteam) {
		super(deptname, name, id, leadname, empid, projectname);
		this.duration=duration;
		this.sizeofteam=sizeofteam;
		// TODO Auto-generated constructor stub
	}
	private int duration;
	private int sizeofteam;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getSizeofteam() {
		return sizeofteam;
	}
	public void setSizeofteam(int sizeofteam) {
		this.sizeofteam = sizeofteam;
	}
	@Override
	public String toString() {
		return "TeamMember [duration=" + duration + ", sizeofteam=" + sizeofteam + ", toString()=" + super.toString()
				+ "]";
	}
	

}
