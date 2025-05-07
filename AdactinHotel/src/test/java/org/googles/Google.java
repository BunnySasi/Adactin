package org.googles;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Google {

	public WebDriver driver;
	@BeforeSuite
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	@Test(groups = "click")
	public void capture() {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc = new File(System.getProperty("user.dir")+"//img//sasi//one.jpeg");
		try {
			FileUtils.copyFile(src, dsc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(groups = "test")
	public void clickGmail() {
		driver.findElement(By.linkText("Gmail")).click();
	}
	@Test(dependsOnGroups = {"test","click"})
	public void testName() throws Exception {
		
	}
	
}
