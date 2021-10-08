package pageObj.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("login1");
	By password = By.id("password");
	By signInBtn = By.xpath("//input[@name='proceed']");
	By loginErrorText = By.tagName("b");
	
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getSignInBtn() {
		return driver.findElement(signInBtn);
	}
	public String getLoginErrorText() {
		return driver.findElement(loginErrorText).getText();
	}
}
