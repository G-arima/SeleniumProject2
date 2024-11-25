package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_OneWayFlights extends DDT
{
WebDriver driver;	

@FindBy(xpath="(//div[contains(@class,'c-inherit')])[1]")	
WebElement search1;

@FindBy(xpath="(//div[contains(@class,'c-inherit')])[2]")
WebElement search2;

@FindBy(xpath="(//div[contains(@class, 'bg-neutral-100')])[3]/li")
List<WebElement> drop1;

@FindBy(xpath="(//button[contains(@class,'bn')])[2]")
WebElement btn1;

@FindBy(xpath="//input[@placeholder='Where from?']")
WebElement search_flight_from;

@FindBy(xpath="//div[@class='dropdown p-absolute t-13 ln-1 w-100p']/ul/li")
List<WebElement> start;

@FindBy(xpath="//input[@placeholder='Where to?']")
WebElement search_flight_to;

@FindBy(xpath="//div[@class='dropdown p-absolute t-13 ln-1 w-100p']/ul/li")
List<WebElement> destination1;

@FindBy(css="div.sc-aXZVg.dSvAMK.mr-2.mt-1")
WebElement date;

@FindBy(css="div.DayPicker-Day.DayPicker-Day--start.DayPicker-Day--selected.DayPicker-Day--today")
WebElement Todays_date;

@FindBy(xpath="//div[contains(@class,'DayPicker-Day')]/div/div")
List<WebElement> calender_date;

@FindBy(css=".sc-dAlyuH.cIApyz")
WebElement search_flights_button;

@FindBy(xpath="(//button[contains(@class,'h-10')])[2]")
WebElement btn2;

@FindBy(xpath="//span[text()='Book now']")
WebElement btn3;

public void dropdown_1(WebDriver driver) {
	
	Actions action=new Actions(driver);
	action.moveToElement(search1).click().build().perform();
	for(WebElement e1:drop1) {
		if(e1.getText().equalsIgnoreCase("One way")) {
			WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
			w1.until(ExpectedConditions.elementToBeClickable(e1)).click();
		}
	}
		}

public void dropdown_2(WebDriver driver) {
	Actions act=new Actions(driver);
	act.moveToElement(search2).click().build().perform();
	WebDriverWait w2=new WebDriverWait(driver,Duration.ofSeconds(10));
	w2.until(ExpectedConditions.visibilityOf(btn1)).click();
}

public void startpoint() {
	WebDriverWait w3=new WebDriverWait(driver, Duration.ofSeconds(10));
	w3.until(ExpectedConditions.visibilityOf(search_flight_from)).click();
	start.get(2).click();
}

public void destination() {
	WebDriverWait w4=new WebDriverWait(driver, Duration.ofSeconds(10));
	w4.until(ExpectedConditions.visibilityOf(search_flight_to)).click();
	destination1.get(4).click();
}

public void selectdate() {
	WebDriverWait w5=new WebDriverWait(driver, Duration.ofSeconds(10));
	w5.until(ExpectedConditions.visibilityOf(date)).click();
	Todays_date.click();
}

public void searchflightbtn() {
	WebDriverWait w6=new WebDriverWait(driver,Duration.ofSeconds(10));
	w6.until(ExpectedConditions.visibilityOf(search_flights_button)).click();
}
	



public ClearTrip_OneWayFlights(WebDriver driver) {
	PageFactory.initElements(driver, this);
}





}
