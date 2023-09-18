package observer_gpcoder;

public class Mailer implements Observer {

	@Override
	public void update(User user) {
		System.out.println("Mailer : " + user.getEmail());
	}
	
}
