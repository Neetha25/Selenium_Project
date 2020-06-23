package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class WorkThree {
  WebDriver driver;
	
  @Test(priority=1)
  public void verifyPageTitle() {
  String actualtitle=driver.getTitle();
  String expectedtitle="Welcome: Mercury Tours";
  Assert.assertEquals(actualtitle, expectedtitle,"wrong page");
  

	
}
  @Test(priority=2)
  public void verifyPageLogin() {
	  WebElement unam=driver.findElement(By.name("userName"));
		 WebElement pword=driver.findElement(By.name("password"));
				unam.sendKeys("tutorial");
			    pword.sendKeys("tutorial");
			    driver.findElement(By.name("login")).submit();
  String actualtitle=driver.getTitle();
  String expectedtitle="Find a Flight: Mercury Tours:";
  Assert.assertEquals(actualtitle, expectedtitle,"wrong page");
  }
  
  @Test(priority=3)
  public void verfiyradioButton(){
	  
	  List<WebElement> radio=driver.findElements(By.name("tripType"));
	 
			boolean val=radio.get(0).isEnabled();
			boolean val1=radio.get(1).isSelected();
			//Assert.assertTrue(val);
			SoftAssert s1=new SoftAssert();
			s1.assertTrue(val);
			s1.assertTrue(val1,"one way radio button ,failed");
			System.out.println("Rest of the code");
			s1.assertAll();
			
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
	  driver= new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");

  }

  @AfterTest
  public void afterTest() {
  }

}
