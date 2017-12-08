package letuanhuy;

import java.util.ArrayList;
import java.util.List;

public class SoftwareHouse {
 private List<Programmer> theStaff;
private String theName;
 public String getTheName() {
	return theName;
}
public void setTheName(String theName) {
	this.theName = theName;
}
public SoftwareHouse(String aName){
	 this.theName = aName;
	 this.theStaff = new ArrayList<Programmer>();
 }
 public List<Programmer> getTheStaff() {
	return theStaff;
}
public void setTheStaff(List<Programmer> theStaff) {
	this.theStaff = theStaff;
}
public void addProgrammer(Programmer p){
	this.theStaff.add(p);
}
public void displayStaff(){
	 System.out.println("Company name:" + this.theName);
	 for(Programmer p: theStaff){
		 p.display();
	 }
 }
}
