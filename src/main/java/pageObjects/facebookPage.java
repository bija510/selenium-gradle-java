package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*======================================================================================================
NOTE:-This is we have to follow Encapsulation = hiding implementation with private variable public Method
	  No Assertion in Page class
======================================================================================================*/
public class facebookPage {

	public WebDriver driver;
	
	public facebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By userName = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='pass']");
	
	public WebElement username() {
		return driver.findElement(userName);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}

	
}
