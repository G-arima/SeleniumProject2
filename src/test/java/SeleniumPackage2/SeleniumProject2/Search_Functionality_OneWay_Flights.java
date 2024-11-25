package SeleniumPackage2.SeleniumProject2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Pro.class)
public class Search_Functionality_OneWay_Flights extends Launch_and_Quit
{
@Test(dataProvider="inputs")
public void method4(String num) {
	ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
	cl.mobile_number.sendKeys(num);
	ClearTrip_OneWayFlights one=new ClearTrip_OneWayFlights(driver);
	one.dropdown_1(driver);
	one.dropdown_2(driver);
	one.startpoint();
	one.destination();
	one.selectdate();
	one.searchflightbtn();
	Assert.assertEquals(one.btn2.isDisplayed(), true);
}
@DataProvider(name="inputs")
public Object[][] test() {
	return new Object[][]{{"8830630126"}};
	
}
}
