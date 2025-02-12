package nopcommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {
    BrowserChoice browser = new BrowserChoice();

    @Before //run before every method
    public void openingBrowser() {
        //initializing the chrome driver and passing the url
        //pre conditions
        browser.browser();
//        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After //run after every method
    public void closingBrowser() {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            try {
//                File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//                //File source = ts.getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(ts, new File("./Screenshots/" + result.getName()+" "+timeStamp()+ ".png"));
//                System.out.println("Screenshot taken");
//                } catch (Exception e) {
//            }
//        }
        driver.quit();
    }
}