package org.adactin.pages;

import org.adactin.tests.AdactinBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLocators extends AdactinBase {

	public WebDriver driver;
	public FacebookLocators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "email")
	private WebElement emailTextField;
	
	@FindBy(id = "pass")
	private WebElement passwordTextField;
	
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	public void performLogin(String email,String passcode) {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(passcode);
		loginBtn.click();
	}
}
