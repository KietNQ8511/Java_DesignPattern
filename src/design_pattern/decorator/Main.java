package design_pattern.decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		System.out.println("NORMAL EMPLOYEE: ");
		EmployeeComponent employee = new EmployeeConcreteComponent("GPCoder");
		employee.showBasisInformation();
		employee.doTask();
		
//		System.out.println("\nTEAM LEADER: ");
//		EmployeeComponent teamLeader = new TeamLeader(employee);
//		teamLeader.showBasisInformation();
//		teamLeader.doTask();
	}
}
