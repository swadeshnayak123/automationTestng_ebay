package com.swadesh.automationTestng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class EbayLogin {

	public static void main(String[] args) {
	
		String browserType = "chrome";
		WebDriver driver = null;
		if(browserType.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\swade\\Downloads\\BrowserDriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    System.out.println("Using chrome driver");
		}
		else if(browserType.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\swade\\Downloads\\BrowserDriver\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    System.out.println("Using FF driver");
		}
				// TODO Auto-generated method stub
				
			    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver.get("https://www.ebay.com/");
			    driver.manage().window().maximize();
		        driver.findElement(By.linkText("Sign in")).click();
		        driver.findElement(By.id("signin_ggl_btn")).click();
		        driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("swadeshnayak123@gmail.com");
		        driver.close();
			}

	
	}


