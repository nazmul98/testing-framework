package framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObj.framework.HomePage;
import utilits.framework.Base;

public class Validator extends Base {
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void getValidate() {
		AssertJUnit.assertEquals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping", driver.getTitle());
		
		HomePage hp = new HomePage(driver);
		AssertJUnit.assertTrue(hp.getNavIcons().isDisplayed());
	}
	
	@AfterTest
	public void closeBrowser () {
		driver.close();
	}
}
