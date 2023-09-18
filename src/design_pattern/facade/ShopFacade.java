package design_pattern.facade;

public class ShopFacade {
	private static final ShopFacade INSTANCE = new ShopFacade();
	
	private AccountService accountService;
	private EmailService emailService;
	private PaymentService paymentService;
	private ShippingService shippingService;
	private SmsService smsService;
	
	private ShopFacade() {
		accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        emailService = new EmailService();
        smsService = new SmsService();
	}
	
	public static ShopFacade getInstance() {
		return INSTANCE;
	}

	public void buyProductByCashWithFreeShipping(String email, String mobilePhone) {
		accountService.getAccount(email);
		paymentService.paymentByCash();
		shippingService.freeShipping();
		emailService.sendMail(email);
		smsService.sendSms(mobilePhone);
		System.out.println("DONE !!!");
	}
}
