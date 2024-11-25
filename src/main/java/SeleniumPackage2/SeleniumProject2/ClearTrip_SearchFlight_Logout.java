package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_SearchFlight_Logout extends ClearTrip_MultiplePassengers{


WebDriver driver;

@FindBy(xpath="(//input[@type='checkbox'])[3]")
WebElement Non_Stop_Flights;

@FindBy(xpath="//p[text()='My account']")
WebElement My_Account_one;

@FindBy(xpath="//span[text()='Sign out']")
WebElement Signing_Out;

public void NonStopFlights() {
	WebDriverWait wdt1=new WebDriverWait(driver,Duration.ofSeconds(10));
	wdt1.until(ExpectedConditions.visibilityOf(Non_Stop_Flights)).click();
}
public void MyAccount() {
	WebDriverWait wdt2=new WebDriverWait(driver,Duration.ofSeconds(10));
	wdt2.until(ExpectedConditions.visibilityOf(My_Account_one)).click();
}
public void SignOut() {
	WebDriverWait wdt3=new WebDriverWait(driver,Duration.ofSeconds(10));
	wdt3.until(ExpectedConditions.visibilityOf(Signing_Out)).click();
}

public ClearTrip_SearchFlight_Logout(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}
}
