package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_SearchResultfordifferentclasses extends ClearTrip_OneWayFlights
{
	WebDriver driver;
	
	@FindBy(xpath="//p[text()='Economy']")
	WebElement search_economy;
	
	@FindBy(xpath="//p[text()='Business class']")
	WebElement search_businessclass;
	
	@FindBy(xpath="//p[text()='First class']")
	WebElement search_firstclass;
	
	@FindBy(xpath="//div[@class='DayPicker-Day']/div/div")
	List<WebElement> nov_month_date;
	
	@FindBy(xpath="(//span[text()='Flight details'])[1]")
	WebElement text_msg;
	
	@FindBy(xpath="//h3[text()='No flights found for this search']")
	WebElement Home_btn_msg;
	
	public void searcheconomy() 
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(search_economy)).click();
		
	}
	public void startdate1() 
	{
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(date)).click();
		nov_month_date.get(4).click();
	}
	public void searchbusiness() 
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOf(search_businessclass)).click();
		
	}
	public void searchfirst() 
	{
		WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.visibilityOf(search_firstclass)).click();
	}
	
	

	public ClearTrip_SearchResultfordifferentclasses(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
