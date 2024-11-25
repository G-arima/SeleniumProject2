package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_MultiplePassengers extends ClearTrip_Seat_Selection 
{
	WebDriver driver;
	@FindBy(xpath="(//button[contains(@class,'c-pointer')])[3]")
	WebElement childern;
	@FindBy(xpath="(//button[contains(@class,'c-pointer')])[5]")
	WebElement infant;
	@FindBy(xpath="(//div[contains(@class,'br-4')])[50]")
	WebElement seat_selection_adult2;
	@FindBy(xpath="(//div[contains(@class,'br-4')])[51]")
	WebElement child1;
	@FindBy(xpath="//button[contains(@class,'deACHI')]")
	WebElement cnt10;
	@FindBy(xpath="//p[text()='Skip add ons']")
	WebElement skip_add_ons;
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement email_id;
	@FindBy(xpath="(//button[contains(@class,'px-7')])[3]")
	WebElement continue_btn_4;
	@FindBy(xpath="(//input[@placeholder='First name'])[1]")
	WebElement first_name;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement last_name;
	@FindBy(xpath="(//button[contains(@class,'flex')])[3]")
	WebElement gender;
	@FindBy(xpath="//div[contains(@class,'bg-white')]/ul/li")
	List<WebElement> options;
	@FindBy(xpath="(//select[@name='title'])[2]")
	WebElement title;
	@FindBy(xpath="(//input[@placeholder='First name'])[2]")
	WebElement first_name1;
	@FindBy(xpath="(//input[@placeholder='Last name'])[2]")
	WebElement last_name1;
	@FindBy(xpath="(//button[contains(@class,'flex')])[4]")
	WebElement gender1;
	@FindBy(xpath="//div[contains(@class,'bg-white')]/ul/li")
	List<WebElement> options1;
	@FindBy(xpath="(//input[@placeholder='First name'])[3]")
	WebElement child_firstname;
	@FindBy(xpath="(//input[@placeholder='Last name'])[3]")
	WebElement child_lastname;
	@FindBy(xpath="(//div[contains(@class,'fs-inherit')])[3]")
	WebElement child_gender;
	@FindBy(xpath="//div[contains(@class,'bg-white')]/ul/li")
	List<WebElement> options2;
	@FindBy(xpath="(//select[contains(@class,'flex')])[1]")
	WebElement child_dob_date;
	@FindBy(xpath="(//select[contains(@class,'flex')])[2]")
	WebElement child_dob_month;
	@FindBy(xpath="(//select[contains(@class,'flex')])[3]")
	WebElement child_dob_year;
	@FindBy(xpath="//button[text()='Continue to payment']")
	WebElement continue_to_pay;
	@FindBy(xpath="(//h4[text()='Okay, continue'])[2]")
	WebElement okay;
	@FindBy(xpath="(//h4[text()='Okay, continue'])[1]")
	WebElement btn5cnt;
	@FindBy(xpath="//h1[text()='Pay to complete your booking']")
	WebElement pay_text;
	
	public void dropdown_2_additional() {
		WebDriverWait wt17=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt17.until(ExpectedConditions.visibilityOf(childern)).click();
		
		
	}
	public void seat_selection_additional(WebDriver driver) {
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();",seat_selection_adult2);
		/*JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();",child1);*/
		
	}
	public void skip_addon(WebDriver driver) {
		/*Point p1=cnt10.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
	
	WebDriverWait wt21=new WebDriverWait(driver,Duration.ofSeconds(10));
	wt21.until(ExpectedConditions.visibilityOf(cnt10)).click();
	try {
		driver.switchTo().alert().accept();
	}catch(NoAlertPresentException e1){
		System.out.println("Exception is handled");
	}*/
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Next_btn);
	
	}
	public void contact() {
		WebDriverWait wt23=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt23.until(ExpectedConditions.visibilityOf(email_id)).click();
		email_id.sendKeys("tester1@gmail.abc");
		WebDriverWait wt24=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt24.until(ExpectedConditions.visibilityOf(continue_btn_4)).click();
	}
	public void travellerdetails(WebDriver driver) 
	{
		WebDriverWait wt25=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt25.until(ExpectedConditions.visibilityOf(first_name)).sendKeys("TestHusband");
		WebDriverWait wt26=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt26.until(ExpectedConditions.visibilityOf(last_name)).sendKeys("ABC");
		WebDriverWait wt27=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt27.until(ExpectedConditions.visibilityOf(gender)).click();
		options.get(0).click();
		
		WebDriverWait wt28=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt28.until(ExpectedConditions.visibilityOf(first_name1)).sendKeys("TestWifey");
		WebDriverWait wt29=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt29.until(ExpectedConditions.visibilityOf(last_name1)).sendKeys("DEF");
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", gender1);
		options.get(1).click();
		
		/*WebDriverWait wt32=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt32.until(ExpectedConditions.visibilityOf(child_firstname)).sendKeys("Abhi");
		WebDriverWait wt33=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt33.until(ExpectedConditions.visibilityOf(child_lastname)).sendKeys("ABC");
		WebDriverWait wt34=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt34.until(ExpectedConditions.visibilityOf(child_gender)).click();
		options.get(0).click();
		
		Select s10=new Select(child_dob_date);
		s10.selectByIndex(1);
		Select s11=new Select(child_dob_month);
		s11.selectByValue("May");
		Select s12=new Select(child_dob_year);
		s12.selectByVisibleText("2016");

		WebDriverWait wt26=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt26.until(ExpectedConditions.visibilityOf(title)).click();
		Select s1=new Select(title);
		s1.selectByVisibleText("Mrs.");
		WebDriverWait wt27=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt27.until(ExpectedConditions.visibilityOf(first_name1)).sendKeys("TestWife");*/
		
	}
	public void cont_to_pay_btn() {
		/*WebDriverWait wt28=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt28.until(ExpectedConditions.visibilityOf(continue_to_pay)).click();
		WebDriverWait wt29=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt29.until(ExpectedConditions.visibilityOf(okay)).click();
		WebDriverWait wt30=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt30.until(ExpectedConditions.visibilityOf(btn5cnt)).click();*/
		WebDriverWait wt91=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt91.until(ExpectedConditions.visibilityOf(continue_to_pay)).click();
	}
	
	

	public ClearTrip_MultiplePassengers(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
