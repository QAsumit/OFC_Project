package primecabinetry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckOut {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://beta.primecabinetry.com/");
		
		//Login to the account 
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div[1]/div/ul/li[3]/div/a[1]/span")).click();
		driver.findElement(By.id("email")).sendKeys("sumit@commercepundit.com");
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span/span")).click();
		
		//Click on the product
		
		Thread.sleep(300);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[1]/ul/li[1]/a")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
		// Mouse hover the product  
		 //driver.findElement(By.linkText("Framed Collection")).click();
		 WebElement ele = driver .findElement(By.xpath("//*[@id=\"effect-1\"]/div/img"));
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).perform();
		 
		 //click on the  catagory  
		 
		 Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='effect-1']/div/div[2]")).click();

		
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div/div/div/div[3]/ul/li[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"product_addtocart_form_2365\"]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/ul/li[6]/div[3]/div/div/button/span/span")).click();
		
		//shopping cart
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div[1]/div/ul/li[4]/div/div[1]/a/span[1]")).click();
		
		
		//Proceed to check out
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[3]/ul/li[1]/button/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button/span/span")).click();
		
		
	}

}
