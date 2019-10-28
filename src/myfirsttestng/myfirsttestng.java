package myfirsttestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myfirsttestng {
	
	//public WebDriver driver;
	public ChromeDriver driver;
	
  @Test(priority=1)
  public void openApp() 
  {
	  driver.get("http://www.google.com");
  }
  @Test(priority=2)
  public void performGoogleSearch()
  {
	  driver.findElementByName("q").sendKeys("How awesome is Tricia");
	  driver.findElementByName("q").sendKeys(Keys.TAB);
	  //driver.findElementByName("btnI").click();
	  driver.findElementByClassName("gNO89b").click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C://Users/justi/Downloads/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() 
  {
	  //driver.close();
  }

}
