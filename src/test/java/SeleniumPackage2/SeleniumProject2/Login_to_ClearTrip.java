package SeleniumPackage2.SeleniumProject2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Pro.class)
public class Login_to_ClearTrip extends Launch_and_Quit
{
	@Test(dataProvider="input")
	public void login(String num) {
		ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
		cl.mobile_number.sendKeys(num);	
		ClearTrip_Login  cl1=new ClearTrip_Login(driver);
		Assert.assertEquals(cl1.text(), true);
	}
	@DataProvider(name="input")
	public Object[][] test1() {
		return new Object[][] {{"9872129519"}};
		
	}
	

}
