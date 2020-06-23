package practice_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		//WebDriver driver= new ChromeDriver();
	    /*driver.get("http://newtours.demoaut.com/");
	          WebElement usernam=driver.findElement(By.name("userName"));
	    		 WebElement pasword=driver.findElement(By.name("password"));
	    				WebElement sigin=driver.findElement(By.name("login"));
	    				usernam.sendKeys("Testlogin");
	    			    pasword.sendKeys("login");
	    				boolean value= usernam.isDisplayed();
	    				boolean value2=pasword.isEnabled();
	    				String tag=usernam.getTagName();
	    				
	    				Dimension d= usernam.getSize();
	    				System.out.println(d.height);
	    				System.out.println(d.width);
	    				
	    				Point p=usernam.getLocation();
	    				System.out.println(p.x);
	    				System.out.println(p.y);*/
	    				
	    				//WebElement lin=driver.findElement(By.linkText("REGISTER"));
	    				//lin.click();
	    				
	    				//WebElement plin=driver.findElement(By.partialLinkText("REG"));
	    				//plin.click();
	    				
	    				/*String s=usernam.getAttribute("type");
	    				System.out.println(s);
	    				String s2=usernam.getCssValue("background-color");
	    				System.out.println(s2);
	    				sigin.submit();*/
	    				
		                WebDriver driver= new ChromeDriver();
	    				driver.get("http://www.testandquiz.com/selenium/testing.html");
	    				List<WebElement> radio= driver.findElements(By.name("gender"));
	    				radio.get(0).click();
	    				boolean ra= radio.get(0).isSelected();
	    				System.out.println(ra);
	    				 
	    				WebElement check = driver.findElement(By.className("Automation"));
	    				boolean q= check.isSelected();
	    				System.out.println(q); 
	    				 }}

//http://newtours.demoaut.com/
