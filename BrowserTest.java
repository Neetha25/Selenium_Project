package practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	WebDriver driver;
	/*public void url()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.com");
		
	}*/
	
	
	
        public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
        System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\firefox\\geckodriver.exe"); 
		//driver = new FirefoxDriver();
	    //driver.get("https://www.google.com");
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.com");*/
	      
	
	}

}
