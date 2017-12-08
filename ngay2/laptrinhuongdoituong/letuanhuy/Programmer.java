package letuanhuy;

public class Programmer extends Employee{
  private String theLanguage;
  private ProjectLeader projectLeader;
 public ProjectLeader getProjectLeader() {
	return projectLeader;
}
public void setProjectLeader(ProjectLeader projectLeader) {
	this.projectLeader = projectLeader;
}
public Programmer(int aPayrollNumber, int aMonthlySalary, String aName, String aLanguage){
	 super(aPayrollNumber, aMonthlySalary, aName);
	 this.theLanguage = aLanguage;
 }
public String getTheLanguage() {
	return theLanguage;
}
public void setTheLanguage(String theLanguage) {
	this.theLanguage = theLanguage;
}
public void addProgrammer(Programmer p){
	//
}
public void display(){
	super.display();
	System.out.println(";\tThe Language:" + this.theLanguage + ((this.projectLeader==null)? "":";---->Project Leader Name:"+this.projectLeader.getTheName()));
}
}
