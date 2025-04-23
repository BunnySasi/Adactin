package org.today.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Customized {

	private Properties properties;
	protected WebDriver driver;
	public Locatorss locatorss;
	private FileInputStream fileInputStream;

	public Properties getPropertiesofPropFiles()  {
		properties = new Properties();
		try {
			fileInputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\properties\\prop.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}

	public void alwaysTakeScreenShot(WebDriver driver, String textname) {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc = new File(System.getProperty("user.dir") + "//Sasi//images//" + textname + ".jpeg");
		try {
			FileUtils.copyFile(src, dsc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Properties getPropertiesofLocators() {
		properties = new Properties();
		try {
			fileInputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\properties\\locators.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}

	public WebDriver performCertainOperations(String browserName, String urlAddress) throws IOException {
		if (browserName.toLowerCase().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(urlAddress);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.manage().window().maximize();
		} else {
			driver = new FirefoxDriver();
			driver.get(urlAddress);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public Properties getPropertiesAccessByName(String name) {
		properties = new Properties();
		try {
			fileInputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\properties\\"+name+".properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(properties.getProperty("email_text_"));
		return properties;
	}

	@Test
	public void testName() throws Exception {
		getPropertiesofPropFiles();
		performCertainOperations(properties.getProperty("browser"), properties.getProperty("url"));
	}
	@Test
	public void testNames() throws Exception {
		getPropertiesAccessByName("locators");
		
	}
}
