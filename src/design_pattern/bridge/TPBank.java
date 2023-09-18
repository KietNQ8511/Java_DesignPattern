package design_pattern.bridge;

public class TPBank extends Bank{

	public TPBank(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openAccount() {
		System.out.print("TPBank ");
		account.openAccount();
	}
	
}
