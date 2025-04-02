package org.adactin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdactinHomePage {

	public WebDriver driver;
	public AdactinHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement passWord;
	@FindBy(id = "login")
	private WebElement login;
	
	public void loginPerform(String uname,String passcode) {
		userName.sendKeys(uname);
		passWord.sendKeys(passcode);
		login.click();
	}
	public void verifyUsername() {
		String[] ax = driver.findElement(By.id("username_show")).getAttribute("value").split(" ");
		String bc = ax[1].trim();
		System.out.println(bc.equalsIgnoreCase("test0000007!"));
	}
}
