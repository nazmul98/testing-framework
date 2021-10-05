package framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;

import pageObj.framework.HomePage;
import utilits.framework.Base;

public class Validator extends Base {
	 // public static Logger log = LogManager.getLogger(Validator.class);
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		// log.info("Successfully gone the Home Page");
	}
	
	@Test
	public void getValidate() {
		Assert.assertEquals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping", driver.getTitle());
		
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.getNavIcons().isDisplayed());
		
		// log.info("Successfully Validated");
	}
	
	@AfterTest
	public void closeBrowser () {
		driver.close();
	}
}
