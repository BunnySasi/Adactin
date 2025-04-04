package org.adactin.tests;

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
	@Test
	public void AdactinLogin() throws Exception {
		adactinHomePage.loginPerform(properties.getProperty("username"), properties.getProperty("password"));
	}
	@Test(dependsOnMethods = {"AdactinLogin"})
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
		
	}
	@Test(dependsOnMethods = {"SearchHotel"})
	public void selectHotel() throws Exception {
		searchHotel.RadioClick("2");
		searchHotel.clickContinue();
	}
}
