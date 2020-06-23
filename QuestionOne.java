package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
	    driver.get("http://www.opesmount.in/grocerystore1/");
        String t= driver.getTitle();
        
        
        	if (t.equals("http://www.opesmount.in/grocerystore1/"))
    		{
    		System.out.println("The title is correct");
    		}
    		else
    		{
    		System.out.println("The title is incorrect");
    		}
			}}
