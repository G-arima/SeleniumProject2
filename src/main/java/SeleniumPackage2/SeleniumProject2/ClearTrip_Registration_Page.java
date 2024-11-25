package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_Registration_Page 
{
WebDriver driver;
@FindBy(xpath="//input[@id='mobile']")
WebElement mobile_number;

@FindBy(linkText="Get OTP")
WebElement otp_button;

@FindBy(xpath="//span[text()='Change number']")
WebElement link;

public void entermobile() 
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(mobile_number));
}

public void getotp() 
{
	WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait1.until(ExpectedConditions.visibilityOf(otp_button)).click();
}

public ClearTrip_Registration_Page(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

}
