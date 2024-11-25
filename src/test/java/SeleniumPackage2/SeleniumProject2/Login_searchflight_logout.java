package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Pro.class)
public class Login_searchflight_logout extends Launch_and_Quit
{
@Test(dataProvider="input")
public void method12(String num) {
	ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
	cl.mobile_number.sendKeys(num);
	ClearTrip_SearchFlight_Logout lg=new ClearTrip_SearchFlight_Logout(driver);
	lg.dropdown_1(driver);
	lg.dropdown_2(driver);
	//lg.dropdown_2_additional();
	lg.startpoint();
	lg.destination();
	lg.date.click();
	JavascriptExecutor js1=(JavascriptExecutor) driver;
	js1.executeScript("arguments[0].click();", lg.calender_date.get(24));
	lg.searchflightbtn();
	//lg.NonStopFlights();
	lg.MyAccount();
	lg.SignOut();
}
@DataProvider(name="input")
public Object[][] testdata1(){
	return new Object[][] {{"9872129519"}};
	
}
}
