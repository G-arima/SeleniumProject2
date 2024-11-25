package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listeners_Pro.class)
public class Validate_systems_ability_to_handle_multiple_passengers_in_single_booking extends Launch_and_Quit{
	
	
	@Test(dataProvider="input")
	public void method9(String num) throws InterruptedException 
	{
		ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
		cl.mobile_number.sendKeys(num);	
		ClearTrip_MultiplePassengers mp=new ClearTrip_MultiplePassengers(driver);
		mp.dropdown_1(driver);
		mp.dropdown_2(driver);
		//mp.dropdown_2_additional();
		mp.startpoint();
		mp.destination();
		mp.date.click();
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", mp.calender_date.get(24));
		mp.searchflightbtn();
		mp.bookbtn();
		//mp.selectbtn();
		//mp.cntbtn0();
		mp.addbtn(driver);
		mp.cntbtn1(driver);
		mp.seatselection(driver);
		mp.seat_selection_additional(driver);
		mp.skip_addon(driver);
		mp.contact();
		mp.travellerdetails(driver);
		mp.cont_to_pay_btn();
		Assert.assertEquals(mp.pay_text.isDisplayed(), true);
		
		
	}
	@DataProvider(name="input")
	public Object[][] testdata() 
	{
		return new Object[][] {{"9872129519"}};
		
	}

}
