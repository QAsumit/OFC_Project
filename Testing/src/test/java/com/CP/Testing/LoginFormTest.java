package com.CP.Testing;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://lovelyfloraworld.cp.netefficiency.co.uk/shop-by-occasion/cbstatio-nextmp-net-pink-crystal.html?options=cart");
		
		
		//WebElement E1 = driver.findElement(By.xpath("//*[@id='options-226-list']/div[2]/label"));
		
		//Get the Radiobutton as WebElement using it's value attribute
		  WebElement petrol = driver.findElement(By.xpath("//*[@id=\"options-226-list\"]/div[2]/label"));
		  petrol.click();

	}

}
