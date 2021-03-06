package framework;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import pageObj.framework.HomePage;
import pageObj.framework.LoginPage;
import utilits.framework.Base;

public class RediffTest extends Base {
	public WebDriver driver;
	
	@Test(dataProvider="getLoginInfo")
	public void rediffTester(String username, String password) throws IOException {
		
		driver = initializeBrowser();
		driver.get("https://www.rediff.com/");
		
		HomePage hp = new HomePage(driver);
		hp.getSignInBtn().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getSignInBtn().click();
		driver.close();
	}
	
	@DataProvider
	public Object[][] getLoginInfo() {
		Object[][] loginInfo = new Object[2][2];
		loginInfo[0][0] = "hello@gmail.com";
		loginInfo[0][1] = "abcdef";
		
		loginInfo[1][0] = "john@gmail.com";
		loginInfo[1][1] = "123456";
		
		return loginInfo;
	}
}

