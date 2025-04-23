package org.today.tasks;
import org.testng.annotations.Test;

public class Base extends Customized{


	@Test
	public void testName() throws Exception {
		performCertainOperations(getPropertiesofPropFiles().getProperty("browser"),getPropertiesofPropFiles().getProperty("url"));
		locatorss = new Locatorss(driver);
		locatorss.enterEmail("ello","ehil");
	}
}
