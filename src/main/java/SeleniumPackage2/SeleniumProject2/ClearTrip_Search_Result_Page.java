package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_Search_Result_Page extends ClearTrip_MultiplePassengers
{
	
	WebDriver driver;
	@FindBy(xpath="(//span[text()='Flight details'])[1]")
	WebElement detailed_view_link;
	@FindBy(xpath="(//h4[text()='Select'])[1]")
	WebElement selection_btn;
	@FindBy(xpath="//p[text()='Cancellation fee from ₹4000']")
	WebElement cancellation_fee;
	@FindBy(xpath="(//p[text()='15 kg Check-in'])[1]")
	WebElement scroll_till;
	@FindBy(xpath="//div[text()='PARTIALLY REFUNDABLE']")
	WebElement Orange_cnt_btn;
	@FindBy(xpath="//span[text()='Know more']")
	WebElement Flight_Details_link;
	@FindBy(xpath="//h3[text()='Baggage Information:']")
	WebElement baggage_info;
	
	public void selectyourfarelink() {
		WebDriverWait wait01=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait01.until(ExpectedConditions.visibilityOf(detailed_view_link)).click();
		/*WebDriverWait wait92=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait92.until(ExpectedConditions.visibilityOf(selection_btn)).click();
		Point p=cancellation_fee.getLocation();
		int x0=p.getX();
		int y0=p.getY();
		System.out.println(x0);
		System.out.println(y0);
		JavascriptExecutor js0=(JavascriptExecutor) driver;
		js0.executeScript("window.scrollBy(0,"+y0+")");
		Point p2=scroll_till.getLocation();
		int x1=p2.getX();
		int y1=p2.getY();
		System.out.println(x1);
		System.out.println(y1);
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,"+y1+")");*/
	}
	
	
	public void clickonflightdetails() {
		WebDriverWait wait90=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait90.until(ExpectedConditions.visibilityOf(Flight_Details_link)).click();
		
	}
	
	public void baggageinformation() {
		Point p1=baggage_info.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,"+y+")");
		}

	public ClearTrip_Search_Result_Page(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);
	}

}
