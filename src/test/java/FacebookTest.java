import pageObjects.facebookPage;
import org.testng.annotations.Test;

public class FacebookTest extends BaseClass {

	@Test
	public void fb_signup() {
		driver.get("https://www.facebook.com");
		facebookPage fbpo = new facebookPage(driver);
		fbpo.username().sendKeys("david");
		fbpo.password().sendKeys("Lee");

	}


}
