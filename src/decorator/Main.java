package decorator;

public class Main {
	public static void main(String[] args) {
		EmployeeComponent leader = new EmployeeConcreteComponent("KietNQ");
		EmployeeComponent manager = new EmployeeConcreteComponent("HoaLNT");

		EmployeeComponent managerEmp = new Manager(manager);
		managerEmp.showBasisInfor();
		managerEmp.doTask();

		EmployeeComponent leaderEmp = new Leader(leader);
		leaderEmp.showBasisInfor();
		leaderEmp.doTask();
	}
}
