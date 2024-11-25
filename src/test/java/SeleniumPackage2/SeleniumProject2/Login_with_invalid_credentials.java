package SeleniumPackage2.SeleniumProject2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Pro.class)
public class Login_with_invalid_credentials extends Launch_and_Quit
{
	@Test(retryAnalyzer=SeleniumPackage2.SeleniumProject2.Retry_Logic.class,dataProvider="inputs")
public void login_invalid(String num,String num1) {
	ClearTrip_Registration_Page cl=new ClearTrip_Registration_Page(driver);
	cl.mobile_number.sendKeys(num);
	ClearTrip_LoginwithInvalidCredentials invalid=new ClearTrip_LoginwithInvalidCredentials(driver);
	invalid.Otp.sendKeys(num1);
	invalid.Otp1.sendKeys(num1);
    invalid.Otp2.sendKeys(num1);
    invalid.Otp3.sendKeys(num1);
	Assert.assertEquals(invalid.invalid_error_msg.isDisplayed(), true);
	
}
	@DataProvider(name="inputs")
	public Object[][] testing(){
		Object[][] d1=new Object[1][2];
		d1[0][0]="6803884422";
		d1[0][1]="0";
		return d1;
		
	}

}
