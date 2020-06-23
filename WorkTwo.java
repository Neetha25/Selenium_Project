package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class WorkTwo {
  WebDriver driver;
	@Test
  public void f() {
		
		/*WebElement unam=driver.findElement(By.name("userName"));
		 WebElement pword=driver.findElement(By.name("password"));
				unam.sendKeys("tutorial");
			    pword.sendKeys("tutorial");
			    driver.findElement(By.name("login")).submit();
			    
			    WebElement passc=driver.findElement(By.name("passCount"));
			    Select obj=new Select(passc);
			    //obj.selectByIndex(3);
			   // obj.selectByValue("2");
			    obj.selectByVisibleText("3");
			   WebElement Selectele= obj.getFirstSelectedOption();
			   String s=Selectele.getText();
			   
			  List<WebElement>  l= obj.getOptions();
				int ls= l.size();
				for(int i=0;i<ls;i++)
				{
					System.out.println(l.get(i).getText());
				}
				
			   System.out.println(s);*/
		
		Assert.assertNull(driver,"driver is not null");
			    
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
	 driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
  }
  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
