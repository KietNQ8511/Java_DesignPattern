package decorator;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent {
	private String name;

	public EmployeeConcreteComponent(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void join(Date date) {
		System.out.print("EmployeeConcreteComponent \t" + this.getName() + "\t join \t\t" + formatDate(date));
		System.out.println("!!!");
	}

	@Override
	public void terminated(Date date) {
		System.out.print("EmployeeConcreteComponent\t" + this.getName() + "\t terminated \t" + formatDate(date));
		System.out.println("!!!");
	}

	@Override
	public void doTask() {
		System.out.print("EmployeeConcreteComponent\t doTask");
		System.out.println("!!!");
	}
}
