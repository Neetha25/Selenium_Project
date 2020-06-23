package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class RightClick {
	WebDriver driver;
  @Test
  public void f() {
	  Actions action= new Actions(driver);
	  WebElement rc=driver.findElement(By.xpath("//*[text()='right click me']"));
	  WebElement edi=driver.findElement(By.xpath("//*[text()='Edit']"));
	  action.contextClick(rc).perform();
	  edi.click();
	  
	  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
	  driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/simple_context_menu.html");
  }

  @AfterTest
  public void afterTest() {
  }

}
