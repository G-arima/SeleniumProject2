package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip_MakePayment extends ClearTrip_MultiplePassengers
{

WebDriver driver;
@FindBy(xpath="//div[text()='Debit/Credit card']")
WebElement Card_link;
@FindBy(xpath="//input[@id='cardNumber']")
WebElement text_card_number;
@FindBy(xpath="//select[@id='expiryMonth']")
WebElement Expiry_month;
@FindBy(xpath="//select[@id='expiryYear']")
WebElement Expiry_Year;
@FindBy(xpath="//input[@name='name']")
WebElement CardHolder_name;
@FindBy(xpath="//input[@name='cvv']")
WebElement cvv_detail;
@FindBy(xpath="//button[text()='Pay now']")
WebElement Pay_Now_btn;
@FindBy(xpath="//button[text()='No, skip']")
WebElement No_Skip;

public void clickoncreditcard() {
	WebDriverWait x0=new WebDriverWait(driver,Duration.ofSeconds(10));
	x0.until(ExpectedConditions.visibilityOf(Card_link)).click();
}
public void entercardnbr() {
	WebDriverWait x1=new WebDriverWait(driver,Duration.ofSeconds(10));
	x1.until(ExpectedConditions.visibilityOf(text_card_number)).sendKeys(cardnum);
}
public void expdate() {
	Select se=new Select(Expiry_month);
	se.selectByValue("09");
	Select se1=new Select(Expiry_Year);
	se1.selectByVisibleText("2029");	
}
public void CardHoldername() {
	WebDriverWait x2=new WebDriverWait(driver,Duration.ofSeconds(10));
	x2.until(ExpectedConditions.visibilityOf(CardHolder_name)).sendKeys("Testerdua");
}
public void cvc() {
	WebDriverWait x3=new WebDriverWait(driver,Duration.ofSeconds(10));
	x3.until(ExpectedConditions.visibilityOf(cvv_detail)).sendKeys(cvv);
}


public ClearTrip_MakePayment(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}

}
