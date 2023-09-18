package decorator;

import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeComponent {
	protected EmployeeComponent employee;

	public EmployeeDecorator(EmployeeComponent employee) {
		this.employee = employee;
	}
	
	@Override
	public String getName() {
		System.out.println("EmployeeDecorator \t: getName method of EmployeeDecorator:");
		return employee.getName();
	}
	
	@Override
	public void join(Date date) {
//		System.out.println("EmployeeDecorator \t: join :");
		employee.join(date);
	}
	
	@Override
	public void terminated(Date date) {
//		System.out.println("EmployeeDecorator \t: terminated :");
		employee.terminated(date);
	}
}
