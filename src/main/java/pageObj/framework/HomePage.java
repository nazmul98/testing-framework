package pageObj.framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By singInBtn = By.linkText("Sign in");
	By navIcons = By.cssSelector(".cell.topicons>a");
	
	public WebElement getSignInBtn() {
		return driver.findElement(singInBtn);
	}
	
	public WebElement getNavIcons () {
		return driver.findElement(navIcons);
	}
}
