package Resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseUtility {
    public static WebDriver driver;
    public Properties prop ;

    public WebDriver initializeDriver() throws IOException
    {
        prop =new Properties();
        //FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//Configuration//Config.properties");
        FileInputStream fis = new FileInputStream("./Configuration/Config.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        String chromePath = prop.getProperty("url");


        System.out.println(chromePath);
        if (browserName.equalsIgnoreCase("CHROME")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("FIREFOX")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if (browserName.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        else if (browserName.equalsIgnoreCase("EDGE")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }

    public void getScreenshot(String result) throws IOException {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//Screenshot//"+result+".BT.png"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
