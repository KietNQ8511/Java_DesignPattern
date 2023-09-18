package decorator;

public class Manager extends EmployeeDecorator {

	public Manager(EmployeeComponent employee) {
		super(employee);
	}

	@Override
	public void doTask() {
		System.out.println("Manager \t: doTask");
		manageProject();
	}

	public void manageProject() {
		System.out.println(employee.getName() + "\t Manager manageProject");
	}

}
