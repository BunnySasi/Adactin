package org.today.tasks;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestsListienersDemos.class)
public class Base extends Customized {

	@Test(testName = "Testings")

	public void testName() throws Exception {
		performCertainOperations(getPropertiesofPropFiles().getProperty("browser"),
				getPropertiesofPropFiles().getProperty("url"));
		locatorss = new Locatorss(driver);
		locatorss.enterEmail("ello", "ehil");
	}
}
