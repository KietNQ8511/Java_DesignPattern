/**
 * 
 */
package design_pattern.bridge;

/**
 * @author kiet.nguyen
 *
 */
public class CheckingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("Checking account");
		
	}
	
}
