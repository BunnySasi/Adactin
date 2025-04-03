package org.adactin.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	public WebDriver driver;
	
@Test
public void testName() throws Exception {
	
	driver = new ChromeDriver();
	driver.get("https://meet.google.com/landing?authuser=0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.xpath("//a[@class='button button--medium header__aside__button']")).click();
	
}
}
