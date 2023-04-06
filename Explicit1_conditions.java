package com.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit1_conditions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\New folder\\Selenium7Pm\\src\\test\\java\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//input[contains(@id,'location')]"));
		search.sendKeys("Anna Nagar");

		//Explicit // Until wait for 1.visibility of element
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Chennai, Tamil Nadu, India')]")));
		until.click();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement element2 = driver.findElement(By.xpath("//*[text()='Search']"));
		Actions clicksearch = new Actions(driver);
		clicksearch.click(element2).perform();

		//Explicit // 2.until wait for visibility 	
		WebElement element3 = driver.findElement(By.xpath("//input[@class=\"_2FkHZ\"]"));
		WebDriverWait send = new WebDriverWait(driver,30);
		send.until(ExpectedConditions.visibilityOf(element3));
		element3.sendKeys("Food");

		//Explicit // until wait for 3. alert is present and accept

		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();

		WebDriverWait alert = new WebDriverWait(driver, 30);
		Alert until2 = alert.until(ExpectedConditions.alertIsPresent());
		until2.accept();
       
		driver.close();





	}



}
