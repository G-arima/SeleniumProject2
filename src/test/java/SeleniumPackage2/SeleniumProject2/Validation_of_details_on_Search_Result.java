package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Pro.class)
public class Validation_of_details_on_Search_Result extends Launch_and_Quit 
{
@Test(dataProvider="input",retryAnalyzer=SeleniumPackage2.SeleniumProject2.Retry_Logic.class)
public void method10(String num) {
	
	ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
	cl.mobile_number.sendKeys(num);	
	ClearTrip_Search_Result_Page sr=new ClearTrip_Search_Result_Page(driver);
	sr.dropdown_1(driver);
	sr.dropdown_2(driver);
	//sr.dropdown_2_additional();
	sr.startpoint();
	sr.destination();
	sr.date.click();
	JavascriptExecutor js1=(JavascriptExecutor) driver;
	js1.executeScript("arguments[0].click();", sr.calender_date.get(24));
	sr.searchflightbtn();
	sr.selectyourfarelink();
	sr.clickonflightdetails();
	Assert.assertEquals(sr.Orange_cnt_btn.isDisplayed(), true);
	
	
}
@DataProvider(name="input")
public Object[][] testingdata() {
	return new Object[][] {{"9872129519"}};
}
}
