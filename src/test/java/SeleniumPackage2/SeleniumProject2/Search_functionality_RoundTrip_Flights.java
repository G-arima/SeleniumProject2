package SeleniumPackage2.SeleniumProject2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Pro.class)
public class Search_functionality_RoundTrip_Flights extends Launch_and_Quit
{
	@Test(dataProvider="inputs")
	public void method5(String num) {
		ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
		cl.mobile_number.sendKeys(num);
		ClearTrip_RoundTripFlights two=new ClearTrip_RoundTripFlights(driver);
		two.drp1(driver);
		two.drp2(driver);
		two.searchfrom();
		two.searchto();
		two.fromdate();
		two.todate();
		two.searchflightbtn();
		Assert.assertEquals(two.nextpagebtn(), true);
		
	}
	@DataProvider(name="inputs")
	public Object[][] test() {
		return new Object[][]{{"9872129519"}};
		
	}

}
