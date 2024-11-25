package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Pro.class)
public class Seat_selection_check extends Launch_and_Quit {
	
	@Test(dataProvider="input",retryAnalyzer=SeleniumPackage2.SeleniumProject2.Retry_Logic.class)
	public void method8(String num) throws InterruptedException {
		ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
		cl.mobile_number.sendKeys(num);
		ClearTrip_OneWayFlights one=new ClearTrip_OneWayFlights(driver);
		one.dropdown_1(driver);
		one.dropdown_2(driver);
		one.startpoint();
		one.destination();
		one.date.click();
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", one.calender_date.get(24));
		one.searchflightbtn();
		ClearTrip_Seat_Selection s1=new ClearTrip_Seat_Selection(driver);
		s1.bookbtn();
		//s1.selectbtn();
		//s1.cntbtn0();
		s1.addbtn(driver);
		s1.cntbtn1(driver);
		s1.seatselection(driver);
		Assert.assertEquals(s1.Next_btn.isDisplayed(), true);
	}
    @DataProvider(name="input")
    public Object[][] testdata1(){
		return new Object[][] {{"8830630126"}};
    	
    }
}
