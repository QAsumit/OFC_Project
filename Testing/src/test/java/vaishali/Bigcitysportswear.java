package vaishali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bigcitysportswear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.bigcitysportswear.com/customer/account/login/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("test");*/
		
		
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.bigcitysportswear.com/customer/account/login/");
		driver1.findElement(By.id("email")).sendKeys("test");
		driver1.findElement(By.xpath("//*[@id='pass']")).sendKeys("test");
		
		
	}

}
