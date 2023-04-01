package findElement.FindElement;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFinder {

	static WebDriver driver;
	@Before
	public void init()
	{
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
	}
	
	@Test
	public void testLocator()
	{
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
	}
}
