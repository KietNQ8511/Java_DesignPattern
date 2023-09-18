package design_pattern.bridge;

public class SavingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("Saving account");
	}

}
