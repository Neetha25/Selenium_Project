package practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	    String title= driver.getTitle();
	    System.out.println(title);
	    String s=driver.getCurrentUrl();
	    System.out.println(s);
	    //driver.quit();
	    driver.close();
	   // String source=driver.getPageSource();
	   // System.out.println(source);  
	
	}}
