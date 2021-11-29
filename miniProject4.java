package com.projects;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class miniProject4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.cowin.gov.in/");	
	    
	    Thread.sleep(3000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)", "");
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,300)", "");
	    Thread.sleep(2000);
	    
	  //  WebElement w = driver.findElement(By.xpath("//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted mat-tab-label-active']"));
	    
	    
	    
	   // Actions a= new Actions(driver);
	    
	    //a.moveToElement(w).build().perform();
	    
	    //a.click().perform();
	    
	    Thread.sleep(2000);
	    
	    WebElement stl = driver.findElement(By.xpath("//span[text()='Select Your State']"));
	
	    Thread.sleep(2000);
	
	    stl.click();
	
	Robot r =new Robot();
	for (int i = 0; i < 31; i++) {
		
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	
	
	}r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
WebElement stt = driver.findElement(By.xpath("//span[text()='Tamil Nadu']"));
	
	System.out.println(stt.getText());
	
	
	WebElement dis = driver.findElement(By.xpath("//span[text()='Select District']"));
	dis.click();
	
	
	for (int i = 0; i < 4; i++) {
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		}r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
	
		WebElement distxt = driver.findElement(By.xpath("//span[text()='Chennai']"));
		
		System.out.println(distxt.getText());
		
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	
	Thread.sleep(2000);
	
	
	WebElement age = driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[2]"));
	
	js.executeScript("arguments[0].click();", age);
	
	WebElement cost = driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[4]"));
	
	js.executeScript("arguments[0].click();", cost);
	
	WebElement vac = driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[6]"));
	js.executeScript("arguments[0].click();", vac);
	
	WebElement hos = driver.findElement(By.xpath("(//div[@class='row-disp'])[1]"));
	
	String host = hos.getText();
	
	System.out.println(host);
	}
}

