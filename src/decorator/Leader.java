package decorator;

public class Leader extends EmployeeDecorator {

	public Leader(EmployeeComponent employee) {
		super(employee);
	}

	@Override
	public void doTask() {
		System.out.println("Leader \t: doTask");
		reportTask();
	}

	public void reportTask() {
		System.out.println(employee.getName() + "\t Leader reportTask");
	}

}
