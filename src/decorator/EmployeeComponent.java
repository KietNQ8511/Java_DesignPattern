package decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent {
	String getName();

	void doTask();

	void join(Date date);

	void terminated(Date date);

	default String formatDate(Date theDate) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(theDate);
	}

	default void showBasisInfor() {
		System.out.println("========================");
		System.out.println("EmployeeComponent the basic information of " + getName() + "!!!");
		join(Calendar.getInstance().getTime());
		Calendar terminateDate = Calendar.getInstance();
		terminateDate.add(Calendar.MONTH, 6);
		terminated(terminateDate.getTime());
	}
}
