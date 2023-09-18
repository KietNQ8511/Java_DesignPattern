package design_pattern.bridge;

public class VCB extends Bank {

	public VCB(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.print("VCB ");
		account.openAccount();
	}

}
