package com.projects;

import java.io.File;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mynthra {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions A = new Actions(driver);
		driver.get("https://www.myntra.com/");

		Thread.sleep(2000);

		//WebElement a = driver.findElement(By.xpath("//h4[text()='Categories To Bag']"));
		for (int i = 0; i < 5; i++) {
		
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		}
		
		//js.executeScript("arguments[0].scrollIntoView(true);", a);
Thread.sleep(6000);
WebElement r = driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[26]"));
js.executeScript("arguments[0].click();", r);
		Thread.sleep(3000);

		WebElement r1 = driver.findElement(By.xpath("//input[@value='girls,boys girls']"));
		js.executeScript("arguments[0].click();", r1);
		A.moveToElement(r1).build().perform();
		A.click().build().perform();
		// r1.click();

		WebElement r2 = driver.findElement(By.xpath("//input[@value='Black']"));
		js.executeScript("arguments[0].click();", r2);
		// r2.click();

		WebElement r3 = driver.findElement(By.xpath("(//h3[text()='POKORY'])[2]"));
		js.executeScript("arguments[0].click();", r3);

		String w1 = driver.getWindowHandle();

		Set<String> l1 = driver.getWindowHandles();

		for (String s : l1) {
			if (!s.equals(w1)) {
				driver.switchTo().window(s);
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter a PIN code']")).sendKeys("602001");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	WebElement c1 = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
	js.executeScript("arguments[0].click();", c1);
	
	Thread.sleep(3000);
	WebElement c2 = driver.findElement(By.xpath("//span[text()='Bag']"));
	js.executeScript("arguments[0].click();", c2);
	
	TakesScreenshot t = (TakesScreenshot) driver;
	File sc1 = t.getScreenshotAs(OutputType.FILE);
	File de1 = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\mynth.png");
	FileUtils.copyFile(sc1, de1);

	
	
	}
}