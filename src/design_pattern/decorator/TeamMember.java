package design_pattern.decorator;

public class TeamMember extends EmployeeDecorator {

	public TeamMember(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	public void reportTask() {
		System.out.println(this.employee.getName() + " is reporting his assigned task.");
	}
	
	public void coordinateWithOthers() {
		System.out.println(this.employee.getName() + " is coordinating with other members of his team.");
	}
	
	@Override
	public void doTask() {
		// TODO Auto-generated method stub
		employee.doTask();
		reportTask();
		coordinateWithOthers();
	}
	
}
