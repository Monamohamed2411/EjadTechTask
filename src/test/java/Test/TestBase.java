package Test;

import Test.utilities.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import java.time.Duration;


public class TestBase {

	public static WebDriver driver ;


	@BeforeTest
	public void startDriver(@Optional ("chrome") String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();


			 driver = new ChromeDriver(chromeOptions);
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://egypt.souq.com/eg-en/");


	}	


//	@AfterTest
//	public void stopDriver() throws InterruptedException {
//		Thread.sleep(1500);
//		driver.quit();
//
//	}
	@AfterMethod
	public void screenshotOnFail(ITestResult result ){
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("failed");
			System.out.println("Taking Screenshot...");
			Helper.captureScreenshoot(driver, result.getName());
		}
	}
}