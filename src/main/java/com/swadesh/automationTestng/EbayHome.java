package com.swadesh.automationTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayHome {
	
	@Test
	public void ebaySearchBox() 
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\swade\\Downloads\\BrowserDriver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebElement dropbox = driver.findElement(By.id("gh-cat"));
	   Select select = new Select(dropbox);
	   select.selectByValue("267");
	   driver.findElement(By.id("gh-btn")).click();
	   driver.close();
    
	}
	@BeforeTest
	public void LunchDriver()
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\swade\\Downloads\\BrowserDriver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://www.ebay.com/");
		   driver.manage().window().maximize();
	}

}
