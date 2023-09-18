package design_pattern.factory_method;

public class BankFactory {
	public BankFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static final Bank getBank(BankType bankType) {
		switch(bankType) {
			case TPBank:
				return new TPBank();
			case VCB:
				return new VCB();
			default: 
				throw new UnsupportedOperationException("Bank not found");
		}
	}
}
