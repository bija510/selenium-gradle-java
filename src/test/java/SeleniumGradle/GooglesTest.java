package SeleniumGradle;

import Resources.BaseClass;
import org.testng.annotations.Test;

/*=========================================================================================================================
Issue test not found to fix==>file==>setting==>build,exe,depl==>build tools==.gradle==>Check both 2 chk box==>
build & run using gradle==Gradle(default) & Run test using intellij idea that's it
https://stackoverflow.com/questions/30474767/no-tests-found-for-given-includes-error-when-running-parameterized-unit-test-in
 =========================================================================================================================
 To Run all test====> gradle.bat test
 =========================================================================================================================*/

public class GooglesTest extends BaseClass {
    @Test
    public void demoGoogtest() {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void Test2Demo() {
        driver.get("https://www.walmart.com");
        System.out.println(driver.getTitle());


    }
}
