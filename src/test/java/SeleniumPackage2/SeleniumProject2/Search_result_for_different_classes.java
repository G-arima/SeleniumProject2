package SeleniumPackage2.SeleniumProject2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Pro.class)
public class Search_result_for_different_classes extends Launch_and_Quit
{
	@Test(dataProvider="inputs")
public void method6(String num) {
		ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
		cl.mobile_number.sendKeys(num);
		ClearTrip_SearchResultfordifferentclasses s1=new ClearTrip_SearchResultfordifferentclasses(driver);
		s1.dropdown_1(driver);
		s1.dropdown_2(driver);
		s1.searcheconomy();
		s1.startpoint();
		s1.destination();
		s1.startdate1();
		s1.searchflightbtn();
		Assert.assertEquals(s1.btn2.isEnabled(), true);
		driver.navigate().back();
		//ClearTrip_SearchResultfordifferentclasses s2=new ClearTrip_SearchResultfordifferentclasses(driver);
		//s1.dropdown_1(driver);
		s1.dropdown_2(driver);
		s1.searchbusiness();
		s1.search2.click();
		//s1.startpoint();
		//s1.destination();
		//s1.startdate1();
		s1.searchflightbtn();
		Assert.assertEquals(s1.text_msg.isDisplayed(), true);
		driver.navigate().back();
		//ClearTrip_SearchResultfordifferentclasses s3=new ClearTrip_SearchResultfordifferentclasses(driver);
		//s1.dropdown_1(driver);
		s1.dropdown_2(driver);
		s1.searchfirst();
		s1.search2.click();
		//s1.startpoint();
		//s1.destination();
		//s1.startdate1();
		s1.searchflightbtn();
		Assert.assertEquals(s1.Home_btn_msg.isDisplayed(), true);
		
}
@DataProvider(name="inputs")
public Object[][] data1(){
	return new Object[][] {{"8830630126"}};
	
}

}
