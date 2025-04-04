package org.adactin.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.adactin.pages.AdactinHomePage;
import org.adactin.pages.SearchHotel;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		adactinHomePage = new AdactinHomePage(driver);
		searchHotel = new SearchHotel(driver);
	}
	@AfterTest
	public void exit() {
//		driver.quit();
	}
}
