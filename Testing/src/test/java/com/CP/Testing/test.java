package com.CP.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new FirefoxDriver();
		
	driver.get("http://commercepunditonline.com/");
	driver.findElement(By.xpath("//*[@id=\"CtlLogin1_Login1_UserName\"]")).sendKeys("sumit@commercepundit.com");
	driver.findElement(By.xpath("//*[@id=\"CtlLogin1_Login1_Password\"]")).sendKeys("Sumit12#");
	driver.findElement(By.xpath("//*[@id=\"CtlLogin1_Login1_Button1\"]")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"TimesheetLink\"]")).click();
	
	driver.findElement(By.xpath("//*[@id='C_C_C_W_ImageButton2']")).click();
	
	
	Thread.sleep(9000);
	//Adding tea brake and lunch brake to the time sheet C_C_C_W_G_C_0
	
	
	driver.findElement(By.xpath("//*[@id='C_C_C_W_G_C_0']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.name("Canvaschamp")).click();
	Select eliment = new Select(driver.findElement(By.xpath("//*[@id='C_C_C_W_G_C_0']"))); 
	eliment.selectByVisibleText("Canvaschamp");
	
	driver.findElement(By.xpath("//*[@id='C_C_C_W_G_P_0']")).click();
	//Thread.sleep(5000);
	Select eliment1 = new Select(driver.findElement(By.xpath("//*[@id='C_C_C_W_G_P_0']"))); 
	eliment1.selectByVisibleText("Canvaschamp Mobile Application");
	
	
	driver.findElement(By.xpath("//*[@id='C_C_C_W_G_PT_0']")).click();
	//Thread.sleep(5000);
	Select eliment11 = new Select(driver.findElement(By.xpath("//*[@id='C_C_C_W_G_PT_0']"))); 
	eliment11.selectByVisibleText("Quality Assurance");
	

	
	//Add MON to FRI
	
	  driver.findElement(By.id("C_C_C_W_G_TT0_0")).click();
	  driver.findElement(By.id("C_C_C_W_G_DS00_0")).clear();
	  driver.findElement(By.id("C_C_C_W_G_TT0_0")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("C_C_C_W_G_DS00_0")).sendKeys("lunch");
	  driver.findElement(By.xpath("//*[@id='C_C_C_W_G_TT0_0']")).sendKeys("0045");
	  
	
	  driver.findElement(By.id("C_C_C_W_G_TT1_0")).sendKeys("0045");
	  driver.findElement(By.id("C_C_C_W_G_TT1_0")).click();
	  driver.findElement(By.xpath("//*[@id='C_C_C_W_G_DS10_0']")).sendKeys("lunch");
	  
	  
	  driver.findElement(By.id("C_C_C_W_G_TT2_0")).sendKeys("0045");
	  driver.findElement(By.id("C_C_C_W_G_TT2_0")).click();
	  driver.findElement(By.xpath("//*[@id='C_C_C_W_G_DS20_0']")).sendKeys("lunch");
	  
	  driver.findElement(By.id("C_C_C_W_G_TT3_0")).sendKeys("0045");
	  driver.findElement(By.id("C_C_C_W_G_TT3_0")).click();
	  driver.findElement(By.xpath("//*[@id='C_C_C_W_G_DS30_0']")).sendKeys("lunch");
	  
	  driver.findElement(By.id("C_C_C_W_G_TT4_0")).sendKeys("0045");	
	  driver.findElement(By.id("C_C_C_W_G_TT4_0")).click();
	  Thread.sleep(500);
	  driver.findElement(By.id("//*[@id='C_C_C_W_G_DS40_0']")).sendKeys("lunch");
	  
	 
	  
	  
		driver.findElement(By.xpath("//*[@id='C_C_C_W_G_C_0']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.name("Canvaschamp")).click();
		Select eliment111 = new Select(driver.findElement(By.xpath("//*[@id='C_C_C_W_G_C_0']"))); 
		eliment111.selectByVisibleText("Canvaschamp");
		
		driver.findElement(By.xpath("//*[@id='C_C_C_W_G_P_0']")).click();
		//Thread.sleep(5000);
		Select eliment1111 = new Select(driver.findElement(By.xpath("//*[@id='C_C_C_W_G_P_0']"))); 
		eliment1111.selectByVisibleText("Canvaschamp Mobile Application");
		
		
		driver.findElement(By.xpath("//*[@id='C_C_C_W_G_PT_0']")).click();
		//Thread.sleep(5000);
		Select eliment11111 = new Select(driver.findElement(By.xpath("//*[@id='C_C_C_W_G_PT_0']"))); 
		eliment11111.selectByVisibleText("Quality Assurance");
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
		
	}

}
