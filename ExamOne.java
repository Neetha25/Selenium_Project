package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ExamOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.com");
	    WebElement x=driver.findElement(By.name("q"));
	    x.sendKeys("Selenium Topic");
	    x.sendKeys(Keys.ENTER);
	    WebElement image=driver.findElement(By.xpath("//*[@id=\"gsr\"]"));
	    image.click();
	    WebElement imageone=driver.findElement(By.id("yDmH0d "));
	    imageone.clear();
	    
		 
	    
	    
	    //x.sendKeys("Keys.Enter");
		 //driver.close();	    
	   // WebElement search=driver.findElement(By.cssSelector                                                    (#fakebox-input));
	    //search.sendKeys("world history");
	    //search.sendKeys(Keys.ENTER);
		
		/*WebElement search=driver.findElement(By.xpath(//*[@id="fakebox-input"]));
	    search.sendKeys("world history");
	    search.sendKeys(Keys.ENTER);*/
	    
	    
	    
	    
	    //driver.manage().window().maximize();‪
	    
	    
	    //driver.get("https://http://newtours.demoaut.com/");
	    //driver.manage().window().maximize();
	   // WebElement name=driver.findElement(By.name("userName"));// 
	    //WebElement name=driver.findElement(By.cssSelector());
	  //WebElement name=driver.findElement(By.xpath();
	   
	    //name.sendKeys("Neetha");
	    //WebElement pword=driver.findElement(By.name("password"));
	    //pword.sendKeys("1234");
	    
	    
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\firefox\\geckodriver.exe"); 
		WebDriver driver= new FirefoxDriver();
	    //driver.get("https://www.google.com");
		driver.get("http://newtours.demoaut.com/");
	    driver.manage().window().maximize();
	     WebElement lin=driver.findElement(By.linkText("SIGN-ON"));
	     lin.click();
	     driver.navigate().back();
	     driver.navigate().forward();
	     driver.navigate().to("https://www.google.com/");
	     driver.navigate().refresh();
	     
	     
	    /* WebElement pin=driver.findElement(By.partialLinkText("SIG"));
	     pin.click(); */
	   
	    
	    
	    /*WebElement name=driver.findElement(By.name("userName"));
	    name.sendKeys("Neetha");
	    WebElement pword=driver.findElement(By.name("password"));
	    pword.sendKeys("1234");*/
	    
	    
	    //WebElement name=driver.findElement(By.cssSelector());
	  //WebElement name=driver.findElement(By.xpath();
	    
		
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\User\\Desktop\\ielatest\\IEDriverServer.exe");
		//WebDriver driver= new InternetExplorerDriver();
	   // driver.get("https://www.google.com");

		  
		
	    //driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		//WebElement x=driver.findElement(By.name("q"));
				
		//driver.findElement(By.name("btnK")).click();
				
		 //x.sendKeys("Selenium Topic");
		 //x.sendKeys("Keys.Enter");
		 //driver.close();  

	    
	}

}
