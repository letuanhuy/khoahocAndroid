package letuanhuy;

public class Employee {
 private int thePayrollNumber;
 private int theMonthlySalary;
 private String theName;
 public Employee(int aPayrollNumber, int aMonthlySalary, String aname){
	 this.thePayrollNumber = aPayrollNumber;
	 this.theMonthlySalary = aMonthlySalary;
	 this.theName=aname;
 }
 public String getTheName() {
	return theName;
}
public void setTheName(String theName) {
	this.theName = theName;
}

public int getThePayrollNumber() {
	return thePayrollNumber;
}
public void setThePayrollNumber(int thePayrollNumber) {
	this.thePayrollNumber = thePayrollNumber;
}
public int getTheMonthlySalary() {
	return theMonthlySalary;
}
public void setTheMonthlySalary(int theMonthlySalary) {
	this.theMonthlySalary = theMonthlySalary;
}
public void display(){
	 System.out.print("Name:" + this.getTheName());
	 //System.out.println("Payroll Number:\t" + this.thePayrollNumber);
	 //System.out.println("Monthly Salary:\t" + this.theMonthlySalary);
}
}
