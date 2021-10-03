package framework;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObj.framework.HomePage;
import pageObj.framework.LoginPage;
import utilits.framework.Base;

public class RediffTest extends Base {
	@Test
	public void rediffTester() throws IOException {
		
		driver = initializeBrowser();
		driver.get("https://www.rediff.com/");
		
		HomePage hp = new HomePage(driver);
		hp.getSignInBtn().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getUsername().sendKeys("hello");
		lp.getPassword().sendKeys("hello");
		lp.getSignInBtn().click();
		
	}
}
