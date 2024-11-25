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

public class ClearTrip_ApplyCoupon extends ClearTrip_MultiplePassengers
{

WebDriver driver;
@FindBy(xpath="//span[@class='remove-button']")
WebElement Removal_link;
@FindBy(xpath="(//span[@class='apply-button-new'])[1]")
WebElement Apply_Coupon_link;

public void removal() {
	Point p11=Removal_link.getLocation();
	int x11=p11.getX();
	int y11=p11.getY();
	System.out.println(x11);
	System.out.println(y11);
	JavascriptExecutor js11=(JavascriptExecutor) driver;
	js11.executeScript("windows.scrollBy(0,"+y11+")");
	WebDriverWait wait0=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait0.until(ExpectedConditions.visibilityOf(Removal_link)).click();
	
}
public void application() {
	WebDriverWait wait01=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait01.until(ExpectedConditions.visibilityOf(Apply_Coupon_link)).click();
}


public ClearTrip_ApplyCoupon(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}
}
