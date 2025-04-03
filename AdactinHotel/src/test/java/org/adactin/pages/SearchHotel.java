package org.adactin.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {

	public WebDriver driver;
	public Select select;
	public SearchHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "location")
	private WebElement location;
	@FindBy(name = "hotels")
	private WebElement hotels;
	@FindBy(name = "room_type")
	private WebElement roomType;
	@FindBy(name = "room_nos")
	private WebElement roomNos;
	@FindBy(name = "datepick_in")
	private WebElement datepickIn;
	@FindBy(name = "datepick_out")
	private WebElement datepickOut;
	@FindBy(name = "adult_room")
	private WebElement adultRoom;
	@FindBy(name = "child_room")
	private WebElement childRoom;
	@FindBy(name = "Submit")
	private WebElement submitBtn;
	@FindBy(name = "Reset")
	private WebElement resetBtn;
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioBtn;
	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	private WebElement continueBtn;
	
	public void selectLocation(String locationName) {
		select = new Select(location);
		select.selectByVisibleText(locationName);
	}
	public void selectHotels(String hotelName) {
		select = new Select(hotels);
		select.selectByVisibleText(hotelName);
	}
	public void selectRoomType(String roomTypes) {
		select = new Select(roomType);
		select.selectByVisibleText(roomTypes);
	}
	public void selectRooms(String rooms) {
		select = new Select(roomNos);
		select.selectByVisibleText(rooms);
	}
	public void selectCheckInDate(String checkIns) {
		datepickIn.clear();
		datepickIn.sendKeys(checkIns);
	}
	public void selectCheckOutDate(String checkOuts) {
		datepickOut.clear();
		datepickOut.sendKeys(checkOuts);
	}
	public void selectAdultsPerRoom(String adults_per_room) {
		select = new Select(adultRoom);
		select.selectByVisibleText(adults_per_room);
	}
	public void selectChildrenPerRoom(String children_per_room) {
		select = new Select(childRoom);
		select.selectByVisibleText(children_per_room);
	}
	public void Search() {
		submitBtn.click();
	}
	public void RadioClick(String count) {
//		radioBtn.click();
//		System.out.println();
		List<WebElement>radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.size());
		for (WebElement webElement : radios) {
			if( webElement.getAttribute("value").equals(count)){
				webElement.click();
			}
		}
	}
	public void clickContinue() {
		continueBtn.click();
	}
}
