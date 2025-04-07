package org.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BookAHotel {

	public WebDriver driver;
	public BookAHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "book_now")
	private WebElement bookNowBtn;
	@FindBy(name = "first_name")
	private WebElement firstName;
	@FindBy(name = "last_name")
	private WebElement lastName;
	@FindBy(name = "address")
	private WebElement addressTextField;
	
	public void createAddress(String address) {
		addressTextField.sendKeys(address);
	}
	
	public void clickBookNow() {
		bookNowBtn.click();
	}
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
		System.out.println(firstName.getAttribute("value"));
		String text = firstName.getAttribute("value").toString();
		System.out.println(text.lastIndexOf(5));
		if (text.charAt(0)=='0') {
			Assert.fail("Please Verify the First Name Properly and always Start your first Name with Letters and not Numbers!!!");
		}
	}
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
		String text = lastName.getAttribute("value").toString();
		if (text.charAt(0)=='0') {
			Assert.fail("Please Verify the Last Name Properly and always Start your first Name with Letters and not Numbers!!!");
		}
	}
}
