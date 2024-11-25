package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_and_Quit extends Listeners_Pro
{

@BeforeMethod
public void initialize() 
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.cleartrip.com/flights");
	}
@AfterMethod
public void exit() throws InterruptedException 
{
	Thread.sleep(15000);
	driver.quit();
}
}
