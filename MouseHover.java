package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseHover {
	WebDriver driver;
  @Test
  public void f() {
	 
			  WebElement m1=driver.findElement(By.linkText("Support"));
	  WebElement m2=driver.findElement(By.linkText("Learning Center"));
	   
			  
			  Actions ac = new Actions (driver);
	  ac.moveToElement(m1).moveToElement(m2).click().build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
	  driver= new ChromeDriver();
	    driver.get("http://jqueryui.com/droppable/");
  }

  @AfterTest
  public void afterTest() {
  }

}
