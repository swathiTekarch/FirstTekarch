package com.automation.commontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4SeleniumQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
     
		driver.get("https://login.salesforce.com");
		WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("your_username");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("your_password");
        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();
        
        }

	
	
	}
	
	
	

