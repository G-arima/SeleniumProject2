package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_Seat_Selection extends ClearTrip_OneWayFlights{
	
	
	@FindBy(xpath="(//button[contains(@class,'sc-jXbUNg')])[2]")
	WebElement Book_btn;
	@FindBy(xpath="//iframe[contains(@data-tagging-id,'G-5CWGPF7QB9')]")
	WebElement frame0;
	@FindBy(xpath="//button[contains(@class,'lhuLme')]")
	WebElement Select_btn;
	@FindBy(xpath="//h3[text()='Continue']")
	WebElement Continue_btn;
	@FindBy(xpath="(//div[@class='flex'])[2]")
	WebElement checkbox1;
	@FindBy(xpath="//button[text()='Book at this price']")
	WebElement book_price_btn;
	@FindBy(xpath="//button[text()='Add']")
	WebElement Add_btn;
	@FindBy(xpath="//button[text()='Continue']")
	WebElement Continue_btn1;
	@FindBy(xpath="(//button[text()='Continue'])[2]")
	WebElement Cnt_btn2;
	@FindBy(xpath="//h4[text()='Select seats']")
	WebElement seat_select_btn;
	@FindBy(xpath="(//div[contains(@class,'br-4')])[49]")
	WebElement seat_select;
	@FindBy(xpath="(//button[contains(@class,'px-7')])[2]")
	WebElement Next_btn;
	@FindBy(xpath="//h4[text()='Done']")
	WebElement Done_btn;
	@FindBy(xpath="//div[text()='Seats selected']")
	WebElement seat_txt;
	
	public void dateselection() {
		WebDriverWait wt2=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt2.until(ExpectedConditions.visibilityOf(date)).click();
		calender_date.get(5).click();
	}
	
	public void bookbtn() {
		WebDriverWait wt1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt1.until(ExpectedConditions.visibilityOf(btn2)).click();
		
	}
	public void selectbtn() {
		WebDriverWait wt3=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt3.until(ExpectedConditions.visibilityOf(Select_btn)).click();
	}
	public void cntbtn0() {
		WebDriverWait wt4=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt4.until(ExpectedConditions.visibilityOf(Continue_btn)).click();
	}
	public void addbtn(WebDriver driver) throws InterruptedException {
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		String s1= it.next();
		String s2=it.next();
		System.out.println(s1);
		System.out.println(s2);
		driver.switchTo().window(s2);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOf(checkbox1)).click();
		/*try {
			driver.switchTo().alert().accept();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not displayed");
		}
		driver.switchTo().window(s2);
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();", book_price_btn);*/
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();",Add_btn );
		
	}
	public void cntbtn1(WebDriver driver) {
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();",Continue_btn1);
		JavascriptExecutor js4=(JavascriptExecutor) driver;
		js4.executeScript("arguments[0].click();",Cnt_btn2);
		
	}
	public void seatselection(WebDriver driver) {
		
		JavascriptExecutor js4=(JavascriptExecutor) driver;
		js4.executeScript("arguments[0].click();",seat_select);
	
		
	}

	public ClearTrip_Seat_Selection(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

}
