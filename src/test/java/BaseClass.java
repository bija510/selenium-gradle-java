import Resources.Base;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**************************************************************************************
note: while running the testNG.xml suite choose from runcinfiguration as Whole project
 if some issue delete the class and create new class
 <------------RUN FROM CMD-------------------></------------RUN>
 C:\Users\Bijaya Chhetri\IdeaProjects\GradleProject>  gradlew.bat test
 BUILD SUCCESSFUL in 28s
 3 actionable tasks: 1 executed, 2 up-to-date
 C:\Users\Bijaya Chhetri\IdeaProjects\GradleProject>
 **************************************************************************************/
public class BaseClass extends Base {
    @BeforeTest
    public void initializeTest() throws IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //this is applicable to all the test
    }

    @AfterTest
    public void tearDownTest(){
        driver.close();
        driver = null ;
    }


    @AfterMethod
    public void screenShot(ITestResult result) throws IOException {
        if(ITestResult.FAILURE == result.getStatus()) {
            getScreenshot(result.getName());
        }
    }
}
