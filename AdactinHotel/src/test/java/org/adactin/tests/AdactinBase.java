package org.adactin.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.adactin.pages.AdactinHomePage;
import org.adactin.pages.BookAHotel;
import org.adactin.pages.FacebookLocators;
import org.adactin.pages.SearchHotel;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBase {
	
	public Properties properties;
	public WebDriverManager driverManager;
	public WebDriver driver;
	public AdactinHomePage adactinHomePage;
	public SearchHotel searchHotel;
	public BookAHotel aHotel;
	public FacebookLocators facebookLocators;
	@BeforeSuite
	public void getProperties() throws IOException {
		properties = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\properties\\prop.properties");
		properties.load(fis);
//		System.out.println(System.getProperty("user.dir"));
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("browser"));
		if (properties.getProperty("browser").toLowerCase().equalsIgnoreCase("chrome")) {
			driverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(properties.getProperty("url"));
			driver.manage().window().maximize();
		}
		else {
			driverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			driver.get(properties.getProperty("url"));
			driver.manage().window().maximize();
		}
		
	}
	@BeforeTest
	public void launch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		adactinHomePage = new AdactinHomePage(driver);
		searchHotel = new SearchHotel(driver);
		aHotel = new BookAHotel(driver);
		facebookLocators = new FacebookLocators(driver);
	}
	public void takeScreenshotAlways(WebDriver driver,String name) {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File fs = ts.getScreenshotAs(OutputType.FILE);
		File ds = new File(System.getProperty("user.dir")+"//images//"+name+".jpeg");
		try {
			FileUtils.copyFile(fs, ds);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterTest
	public void exit() {
//		driver.quit();
	}
}
