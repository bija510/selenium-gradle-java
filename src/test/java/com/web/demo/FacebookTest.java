package com.web.demo;

import Resources.BaseClass;
import org.testng.annotations.Test;


/*======================================================================================================
NOTE:- No driver instance in Test class According to POM concept
POM is also known as lazy initialization technique for Test
======================================================================================================*/

public class FacebookTest extends BaseClass {

	@Test
	public void fb_signupTest() {
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");


	}


}
