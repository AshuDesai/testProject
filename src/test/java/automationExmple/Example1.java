package automationExmple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	@Test
	public static void weblaucher() {
	
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();	
		 driver.get("http://www.amazon.in");
		 
System.out.println("**************MyFirstProgram********************");		 
		 driver.close();
		 
	}
}
