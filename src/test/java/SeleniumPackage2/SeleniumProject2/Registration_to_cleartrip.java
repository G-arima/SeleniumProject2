package SeleniumPackage2.SeleniumProject2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;


@Listeners(Listeners_Pro.class)
public class Registration_to_cleartrip extends Launch_and_Quit 
{
	@Test(dataProvider="input")
	public void testcase_1(String num) 
	{
	ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
	cl.mobile_number.sendKeys(num);
	Assert.assertEquals(cl.link.isDisplayed(), true);
	}
	@DataProvider(name="input")
	public Object[][] test1() {
		return new Object[][] {{"8830630126"}};
		
	}
}
