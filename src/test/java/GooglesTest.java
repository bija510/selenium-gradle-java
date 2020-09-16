import org.testng.annotations.Test;

public class GooglesTest extends BaseClass {
    @Test
    public void demoGoogtest() {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

    /****************
     * To Run all test
     * gradle.bat test
    ****************/

    }
}
