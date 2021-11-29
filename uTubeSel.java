package com.projects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uTubeSel {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	JavascriptExecutor js =(JavascriptExecutor) driver;
	
	driver.get("https://www.youtube.com/");
	
	WebElement in = driver.findElement(By.xpath("//input[@id='search']"));

	in.sendKeys("selenium");
	
	Thread.sleep(3000);
	driver.findElement(By.id("search-icon-legacy")).click();
	
	
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	
	WebElement titl = driver.findElement(By.xpath("//a[@title='Selenium Full Course - Learn Selenium in 12 Hours | Selenium Tutorial For Beginners | Edureka']"));
	
	js.executeScript("arguments[0].scrollIntoView();", titl);

	String name = titl.getText();
	
	System.out.println("Clicked video:  "+name);

	js.executeScript("arguments[0].click();",titl);
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
	
	TakesScreenshot t = (TakesScreenshot) driver;
	
	File src = t.getScreenshotAs(OutputType.FILE);
	
	File de =new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\utubesel.png");
	
	FileUtils.copyFile(src, de);
	
	WebElement slctdtx = driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'Selenium Full Course - Learn Selen')])[1]"));

	String text = slctdtx.getText();
	
	if (name.equalsIgnoreCase(text)) {
		System.out.println("Played video:  "+text);
		System.out.println();
		System.out.println("Match");
	}


}
}
