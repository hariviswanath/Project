package com.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Three_type_Dynamic_wait {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Explicit wait
		
		WebElement element = driver.findElement(By.xpath(null));
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		//Fluent wait
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).
				pollingEvery(30,TimeUnit.SECONDS).withTimeout(10,TimeUnit.SECONDS).
				ignoring(Exception.class);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
