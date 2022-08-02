package QaUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public TestBase (WebDriver driver) {
        this.driver = driver;
    }
    public static WebDriver driver;
    public Properties prop;
    // Create constructor to read properties from config property

    FileInputStream fis;

    {
        try {
            prop = new Properties();
            fis = new FileInputStream( "C:/Users/fbsye/eclipse-workspace/Test2/src/main/resources/config.properties");
            prop.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initiallization(){

        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C://Users//fbsye//IntelijProject//TestNGJenkins//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(prop.getProperty("url"));
        }
    }

}
