package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_RoundTripFlights extends ClearTrip_OneWayFlights
{

WebDriver driver;
@FindBy(xpath="(//div[contains(@class,'bg-neutral-100')])[3]/li/div")
List<WebElement> option2;
@FindBy(xpath="(//button[contains(@class,'bn')])[4]")
WebElement child_btn;
@FindBy(xpath="(//div[contains(@class,'focus:bc-secondary-500')])[4]")
WebElement ret1;
@FindBy(xpath="(//div[@class='DayPicker-Day'])[20]")
WebElement ret_date;

public void drp1(WebDriver driver) {
	Actions act2=new Actions(driver);
	act2.moveToElement(search1).click().build().perform();
	for(WebElement e2:option2) {
		if(e2.getText().equalsIgnoreCase("Round trip")) {
			e2.click();
		}
	}
	
}
public void drp2(WebDriver driver) {
	Actions act3=new Actions(driver);
	act3.moveToElement(search2).click().build().perform();
	WebDriverWait w10=new WebDriverWait(driver,Duration.ofSeconds(10));
	w10.until(ExpectedConditions.visibilityOf(btn1)).click();
	WebDriverWait w11=new WebDriverWait(driver,Duration.ofSeconds(10));
	w11.until(ExpectedConditions.visibilityOf(child_btn)).click();
	
}
public void searchfrom() {
	WebDriverWait w12=new WebDriverWait(driver,Duration.ofSeconds(10));
	w12.until(ExpectedConditions.visibilityOf(search_flight_from)).click();
	start.get(2).click();
}
public void searchto() {
	WebDriverWait w13=new WebDriverWait(driver,Duration.ofSeconds(10));
	w13.until(ExpectedConditions.visibilityOf(search_flight_to)).click();
	destination1.get(4).click();
}
public void fromdate() {
	WebDriverWait w14=new WebDriverWait(driver, Duration.ofSeconds(10));
	w14.until(ExpectedConditions.visibilityOf(date)).click();
	Todays_date.click();
}
public void todate() {
	WebDriverWait w15=new WebDriverWait(driver,Duration.ofSeconds(10));
	w15.until(ExpectedConditions.visibilityOf(ret1)).click();
	WebDriverWait w16=new WebDriverWait(driver,Duration.ofSeconds(10));
	w16.until(ExpectedConditions.visibilityOf(ret_date)).click();
}
public boolean nextpagebtn() {
	WebDriverWait w17=new WebDriverWait(driver,Duration.ofSeconds(10));
	return w17.until(ExpectedConditions.visibilityOf(btn3)).isDisplayed();
}
	
public ClearTrip_RoundTripFlights(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}
}
