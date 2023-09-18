package design_pattern.facade;

public class PaymentService {
	public void paymentByPaypal() {
		System.out.println("Payment by paypal");
	}
	
	public void paymentByCreditCard() {
		System.out.println("Payment by credit card");
	}
	
	public void paymentByEBankingAccount() {
		System.out.println("Payment by E-Banking");
	}
	
	public void paymentByCash() {
		System.out.println("Payment by cash");
	}
}
