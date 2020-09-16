package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookPage {

	public WebDriver driver;
	
	public facebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By userName = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	
	public WebElement username() {
		return driver.findElement(userName);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}

	
}
