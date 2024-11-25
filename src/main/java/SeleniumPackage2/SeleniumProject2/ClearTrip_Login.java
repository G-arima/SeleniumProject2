package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_Login 
{
WebDriver driver;
@FindBy(xpath="//h4[text()='Search flights']")
WebElement search_flights_text;

public boolean text() 
{
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
	return w1.until(ExpectedConditions.visibilityOf(search_flights_text)).isEnabled();
}
public ClearTrip_Login(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
}
