package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_LoginwithInvalidCredentials 
{
WebDriver driver;
@FindBy(xpath="(//div[@class='sc-aXZVg gFXWRY flex'])[2]/input")
WebElement Otp;

@FindBy(xpath="((//div[@class='sc-aXZVg gFXWRY flex'])[2]/input)[2]")
WebElement Otp1;

@FindBy(xpath="((//div[@class='sc-aXZVg gFXWRY flex'])[2]/input)[3]")
WebElement Otp2;

@FindBy(xpath="((//div[@class='sc-aXZVg gFXWRY flex'])[2]/input)[4]")
WebElement Otp3;

@FindBy(xpath="//p[text()='Please enter a valid OTP']")
WebElement invalid_error_msg;

public void enterOtp() {
	WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
	w1.until(ExpectedConditions.visibilityOf(Otp));
}
public ClearTrip_LoginwithInvalidCredentials(WebDriver driver) {
	PageFactory.initElements(driver, this);	
}
}
