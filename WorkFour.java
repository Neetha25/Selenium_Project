package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class WorkFour {
	 WebDriver driver;
	
	@Test
 
  public void f() {
	  
	  /*WebElement unam=driver.findElement(By.name("userName"));
		 WebElement pword=driver.findElement(By.name("password"));
				unam.sendKeys("Testlogin");
			    pword.sendKeys("login");
			    driver.findElement(By.name("login")).submit();*/
		WebElement state=driver.findElement(By.name("States"));
		Select obj=new Select(state);
		WebElement Selectele= obj.getFirstSelectedOption();
		   String s=Selectele.getText();
		obj.selectByIndex(0);
		obj.selectByIndex(2);
		obj.deselectByIndex(2);
		List<WebElement>  l= obj.getOptions();
		int ls= l.size();
		for(int i=0;i<ls;i++)
		{
			System.out.println(l.get(i).getText());
		}
		
		
		//System.out.println();
}
	  
  
  @BeforeTest
  public void beforeTest() {
	  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		 driver= new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
