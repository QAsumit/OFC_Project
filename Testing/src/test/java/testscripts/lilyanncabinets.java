package testscripts;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lilyanncabinets {
	

 public static WebDriver driver;
 
	public static void main(String []args) {
		try
		{
			
			driver = new ChromeDriver();
				
			http://www.lilyanncabinets.com/key-largo-white-kitchen-cabinets.html
			
			//driver.get("http://www.lilyanncabinets.com/bristol-chocolate-kitchen-cabinets.html");
				driver.get("http://www.lilyanncabinets.com/key-largo-white-kitchen-cabinets.html");
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(5000);
			
			List<WebElement> proName = driver.findElements(By.xpath("//div[@class='pro-listing-left']/..//h4[@class='product-name']"));
			System.out.println(proName.size());
			
			for (int i = 0; i < proName.size(); i++) {
				System.out.println(proName.get(i).getText());
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
