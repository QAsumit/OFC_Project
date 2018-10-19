package com.CP.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import jdk.nashorn.internal.scripts.JS;

public class sikuli_test {

	private static RemoteWebDriver js;

	public static void main(String[] args) {
		
    WebDriver  driver  =  new  ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("http://shop.uscabinetdepot.com/frameless-category.html");
   // driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/div[1]/div/div[3]/div[1]/a")).click();
    driver.findElement(By.id("email")).sendKeys("commerce.pundit116@gmail.com");
   driver.findElement(By.id("pass")).sendKeys("123456");
   driver.findElement(By.xpath("//*[@id=\"send2\"]/span/span")).click();
  //  driver.findElement(By.xpath("/html/body/div[6]/div/div/a")).click();
		
	//driver.findElement(By.xpath("html/body/div[3]/div/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[3]/ul/li[1]/a")).click();
	driver.findElement(By.cssSelector("css=#send2>span>span")).click();	
	
	
	
	//<code for scroll up >//
	  WebElement Element = driver.findElement(By.linkText("Privacy Policy"));

	js.executeScript("arguments[0].scrollIntoView();", Element);
	
	}

}
