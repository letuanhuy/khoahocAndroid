package letuanhuy;

public class MainTest {

	public static void main(String[] args) {
	  SoftwareHouse sh = new SoftwareHouse("VNPT-TG");	
	  // Create some new programmers
	  Programmer p1 = new Programmer(1,2000,"NGUYEN VAN A","C++");
	  Programmer p2 = new Programmer(2,2500,"NGUYEN VAN B","Java");
	  Programmer p3 = new Programmer(3,3500,"NGUYEN VAN C","PHP");
	  
	  // Create some new project leaders
	  Programmer pl1 = new ProjectLeader(5,5000,"NGUYEN VAN D","C++");
	  Programmer pl2 = new ProjectLeader(6,5000,"NGUYEN VAN E","JAVA");
	  
	  // Assign each programmer to a project leader
	  pl1.addProgrammer(p1);
	  pl2.addProgrammer(p2);
	  pl2.addProgrammer(p3);
	  
	  // Hire each programmer and project leader
	  sh.addProgrammer(p1);
	  sh.addProgrammer(p2);
	  sh.addProgrammer(p3);
	  sh.addProgrammer(pl1);
	  sh.addProgrammer(pl2);
	  
	  // Display some details of the staff.
	  sh.displayStaff();
	}

}
