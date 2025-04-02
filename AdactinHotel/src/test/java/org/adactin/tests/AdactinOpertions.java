package org.adactin.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AdactinOpertions extends AdactinBase {

	@Test
	public void firstOne() throws Exception {
		adactinHomePage.loginPerform(properties.getProperty("username"),properties.getProperty("password"));
		adactinHomePage.verifyUsername();
	}
}
