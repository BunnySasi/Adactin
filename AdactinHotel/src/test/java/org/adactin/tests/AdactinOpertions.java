package org.adactin.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdactinOpertions extends AdactinBase {

	@Test
	public void firstOne() throws Exception {
		adactinHomePage.loginPerform(properties.getProperty("username"), properties.getProperty("password"));
		adactinHomePage.verifyUsername();
		searchHotel.selectLocation("London");
		searchHotel.selectHotels("- Select Hotel -");
		searchHotel.selectRoomType("- Select Room Type -");
		searchHotel.selectRooms("5 - Five");
		searchHotel.selectCheckInDate("01/01/1997");
		searchHotel.selectCheckOutDate("09/02/2000");
		searchHotel.selectAdultsPerRoom("3 - Three");
		searchHotel.selectChildrenPerRoom("2 - Two");
		searchHotel.Search();
		searchHotel.RadioClick("2");
		searchHotel.clickContinue();
	}
	@Test(groups = "Login")
	public void AdactinLogin() throws Exception {
		adactinHomePage.loginPerform(properties.getProperty("username"), properties.getProperty("password"));
	}
	@Test(dependsOnMethods = {"AdactinLogin"},groups = "Login")
	public void SearchHotel() throws Exception {
		searchHotel.selectLocation("London");
		searchHotel.selectHotels("- Select Hotel -");
		searchHotel.selectRoomType("- Select Room Type -");
		searchHotel.selectRooms("5 - Five");
		searchHotel.selectCheckInDate("01/01/1997");
		searchHotel.selectCheckOutDate("09/02/2000");
		searchHotel.selectAdultsPerRoom("3 - Three");
		searchHotel.selectChildrenPerRoom("2 - Two");
		searchHotel.Search();
		searchHotel.RadioClick("3");
		searchHotel.clickContinue();
		aHotel.clickBookNow();
		aHotel.enterFirstName("Helos!");
		aHotel.clickBookNow();
		aHotel.enterLastName("llll");
		aHotel.createAddress("Hello!!,World!!,How is your day going on??");
	}
	@Test(dependsOnMethods = {"SearchHotel"},dependsOnGroups = {"Login"})
	public void selectHotel() throws Exception {
		searchHotel.RadioClick("2");
		searchHotel.clickContinue();
	}
	@Test(dataProvider = "data_one",dependsOnMethods = {"AdactinLogin"})
	public void SearchHotels(String loactionName,String HotelName) throws Exception {
		searchHotel.selectLocation(loactionName);
		searchHotel.selectHotels(HotelName);
	}
	@DataProvider(name = "data_one")
	public Object[][]getDataProviders(){
		return new Object[][] {
			{"London","Hotel Creek"},
			{"London","Hotel Creek"},
			{"London","Hotel Creek"}
		};
	}
}
