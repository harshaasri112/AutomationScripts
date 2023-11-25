package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void project()
	{
		Reporter.log("task1");
    }
	@BeforeTest
	public void Setpro()
	{
		System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@BeforeMethod
	public void openBrowser()
	{
	driver = new ChromeDriver();
	driver.get("https://adnabu-arjun.myshopify.com/"); 
	
	}
//	@AfterMethod
//	public void close()
//     {
//		driver.quit();
//	}
	}