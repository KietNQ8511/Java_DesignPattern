package design_pattern.decorator;

public class TeamLeader extends EmployeeDecorator {

	public TeamLeader(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}
	
	public void planning() {
		System.out.println(this.employee.getName() + " is planning.");
	}
	
	public void motivate() {
		System.out.println(this.employee.getName() + " is motivating his member.");
	}
	
	public void monitor() {
		System.out.println(this.employee.getName() + " is monitoring his members.");
	}

	@Override
	public void doTask() {
		// TODO Auto-generated method stub
		employee.doTask();
		planning();
		motivate();
		monitor();
	}
	
}
