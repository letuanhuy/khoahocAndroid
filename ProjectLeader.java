package letuanhuy;

import java.util.ArrayList;
import java.util.List;

public class ProjectLeader extends Programmer{
 private List<Programmer> theTeam;

public ProjectLeader(int aPayrollNumber, int aMonthlySalary, String aName, String aLanguage){
	 super(aPayrollNumber, aMonthlySalary, aName, aLanguage);
	 this.theTeam = new ArrayList<Programmer>();
 }
public List<Programmer> getTheTeam() {
	return theTeam;
}
public void setTheTeam(List<Programmer> theTeam) {
	this.theTeam = theTeam;
}
public void addProgrammer(Programmer p){
	p.setProjectLeader(this);
	this.theTeam.add(p);
}
}
