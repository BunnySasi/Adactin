package org.alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Alerts {
	/*
	 * Types of Alerts: 1.Simple Alert - A simple alert is a pop-up message box that
	 * displays information and has only an OK button for the user to accept.
	 * 2.Confirm Alert - A confirm alert is a pop-up message box that displays
	 * information and has OK and Cancel buttons for the user to accept or dismiss.
	 * 3.Prompt Alert - A prompt alert is a pop-up message box that asks the user
	 * for input and has OK and Cancel buttons to submit or dismiss the input.
	 * ------------------------------------------------------------------------------
	 * How to handle alerts in Selenium
	 * Syntax: driver.switchTo().alert().accept(); --> For Acceptance
	 * driver.switchTo().alert().dismiss(); --> For Dismiss
	 * -----------------------------------------------------------------------------
	 * Website Link:			https://letcode.in/alert
	 */

	public WebDriver driver;
	@BeforeSuite
	public void browserOpen() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		driver.manage().window().maximize();
	}
	@Test
	public void simpleAlert() throws Exception {
		/* Here, I take Id locator of Simple Alert Button and perform click operation*/
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void confirmAlert() throws Exception {
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
	}
	@Test
	public void promptAlert() throws Exception {
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Hello,World!!");
		driver.switchTo().alert().accept();
	}
}
