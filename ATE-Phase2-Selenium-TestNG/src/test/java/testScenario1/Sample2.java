package testScenario1;

import org.testng.annotations.Test;

public class Sample2 {
	
	@Test(priority='1', groups= {"smoke", "functional", "regression"})
	public void opentheAccountpage() {
		System.out.println("Open the browser and open Account page");
	}
	@Test(priority='2', groups= {"functional"})
	public void login() {
		System.out.println("Login into account page");
	}
	@Test(priority='3', groups= {"regression"})
	public void Accounts() {
		System.out.println("Check Account page");
	}
	@Test(priority='4', groups= {"regression"})
	public void Logouts() {
		System.out.println("Logout successfully");
	}

}
