package utilits.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeBrowser () throws IOException {
		
		String basePath = System.getProperty("user.dir");
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(basePath + "/src/main/java/app.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", basePath + "/driver/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", basePath + "/driver/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public void screenshotTaker(String methodName, WebDriver driver) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir") + "/reports/" + methodName + ".png";
		FileUtils.copyFile(srcFile, new File(destFile));
	}
	
	
}
