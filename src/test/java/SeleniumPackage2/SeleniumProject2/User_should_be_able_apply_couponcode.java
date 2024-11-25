package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Pro.class)
public class User_should_be_able_apply_couponcode extends Launch_and_Quit
{
@Test(dataProvider="input")
public void method13(String num) throws InterruptedException 
{
	ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
	cl.mobile_number.sendKeys(num);	
	ClearTrip_ApplyCoupon ac=new ClearTrip_ApplyCoupon(driver);
	ac.dropdown_1(driver);
	ac.dropdown_2(driver);
	ac.startpoint();
	ac.destination();
	ac.date.click();
	JavascriptExecutor js1=(JavascriptExecutor) driver;
	js1.executeScript("arguments[0].click();", ac.calender_date.get(24));
	ac.searchflightbtn();
	ac.bookbtn();
	//ac.selectbtn();
	//ac.cntbtn0();
	ac.addbtn(driver);
	Thread.sleep(2000);
	//ac.removal();
	ac.application();
	Assert.assertEquals(ac.Removal_link.isEnabled(), true);
}
@DataProvider(name="input")
public Object[][] testdata1(){
	return new Object[][] {{"8830630126"}};
	
}
}
