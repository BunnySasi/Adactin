package org.today.tasks;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locatorss extends Customized {

	public Locatorss(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*Pagefactory*/
	@FindBy(name = "login")
	private WebElement loginBtn;
	/*POM*/
	By password_locator = By.id(getPropertiesofLocators().getProperty("password_text_"));
	By email_id_locator = By.id(getPropertiesofLocators().getProperty("email_text_"));
	public void enterEmail(String text,String passcode) {
		driver.findElement(email_id_locator).sendKeys(text);
		driver.findElement(password_locator).sendKeys(passcode);
		loginBtn.click();
		Assert.assertFalse(false);
	}


}
