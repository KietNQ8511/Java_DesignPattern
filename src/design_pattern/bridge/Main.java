package design_pattern.bridge;

public class Main {
	public static void main(String[] args) {
		Bank vcb = new VCB(new CheckingAccount());
		vcb.openAccount();
		System.out.println("========================================");
		
		Bank tpbank = new TPBank(new SavingAccount());
		tpbank.openAccount();
	}
}
