package SeleniumGradle;

import Resources.BaseClass;
import pageObjects.facebookPage;
import org.testng.annotations.Test;

/*======================================================================================================
NOTE:- No driver instance in Test class According to POM concept
POM is also known as lazy initialization technique
======================================================================================================*/

public class FacebookTest extends BaseClass {

	@Test
	public void fb_signupTest() {
		driver.get("https://www.facebook.com");
		facebookPage fbLoginPage = new facebookPage(driver);
		fbLoginPage.username().sendKeys("david");
		fbLoginPage.password().sendKeys("Lee");

	}


}
