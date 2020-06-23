package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
	    driver.get("http://www.opesmount.in/grocerystore1/");
	    driver.navigate().to("https://www.toolspa.com/autoamtion-practice-form");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().back();
	    driver.navigate().refresh();
	
	}

}
