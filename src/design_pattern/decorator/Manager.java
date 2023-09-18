package design_pattern.decorator;

public class Manager extends EmployeeDecorator {

	public Manager(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	public void createRequirement() {
		System.out.println(this.employee.getName() + " is create requirement.");
	}

	public void assignTask() {
		System.out.println(this.employee.getName() + " is assigning task.");
	}
	
	public void manageProgress() {
		System.out.println(this.employee.getName() + " is managing the progress.");
	}
	
	@Override
	public void doTask() {
		// TODO Auto-generated method stub
		employee.doTask();
		createRequirement();
		assignTask();
		manageProgress();
	}

}
