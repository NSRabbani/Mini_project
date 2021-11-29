package com.projects;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jaddu {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cowin.gov.in/");

		Thread.sleep(2500);

		String ti = driver.getTitle();
		System.out.println(ti);
		if (ti.contains("Cowin") == true) {

			System.out.println("You are entered into cowin page");
			System.out.println();

		}Thread.sleep(2000);

		WebElement a = driver.findElement(By.xpath("//label[text()='By District']"));
		// "/html/body/app-root/div/section/app-home/div[6]/div/appointment-table/div/div/div/div/div/div/div/div/div/div/form/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-form-field/div[1]/div[1]/div[1]/mat-select/div/div[2]/div[1]"
		// )); // ("//div[text()='ByDistrict'];

		JavascriptExecutor a1 = (JavascriptExecutor) driver;

		a1.executeScript("arguments[0].scrollIntoView();", a);

		a1.executeScript("arguments[0].click();", a);

		Actions m = new Actions(driver);

		Thread.sleep(2000);

		WebElement b = driver.findElement(By.xpath("//span[text()='Select Your State']"));
		a1.executeScript("arguments[0].click();", b);

		WebElement c = driver.findElement(By.xpath("//span[contains(text(),'Tamil Nadu')]"));

		a1.executeScript("arguments[0].scrollIntoView();", c);

		a1.executeScript("arguments[0].click();", c);

		String c1 = c.getText();
		System.out.println("The selected state is " + c1);
		System.out.println();

		WebElement d = driver.findElement(By.xpath("//span[contains(text(),'Select District')]"));

		a1.executeScript("arguments[0].click();", d);
		Thread.sleep(3000);
		
		 Thread.sleep(2000);
			
		Robot r =new Robot();
		for (int i = 0; i < 5; i++) {
			
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		}r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	WebElement distxt = driver.findElement(By.xpath("//span[text()='Chennai']"));
	Thread.sleep(3000);
		
		System.out.println(distxt.getText());
		Thread.sleep(2000);
	
		
		
		
		
		/*
		 * WebElement e =
		 * driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"));
		 * Thread.sleep(3000); a1.executeScript("arguments[0].scrollIntoView();", e);
		 * 
		 * a1.executeScript("arguments[0].click();", e);
		 * 
		 * String e1 = e.getText(); System.out.println("The selected district is " +
		 * e1); System.out.println();
		 */
		WebElement f = driver.findElement(By.xpath("//button[text()='Search']"));
		a1.executeScript("arguments[0].click();", f);
		
		Thread.sleep(3000);

		WebElement g = driver.findElement(By.xpath("//label[text()='18 & Above']"));
		a1.executeScript("arguments[0].click();", g);

		String g1 = g.getText();
		System.out.println("You have clicked " + g1);
		System.out.println();

		WebElement h = driver.findElement(By.xpath("//label[text()='Paid']"));
		a1.executeScript("arguments[0].click();", h);

		String h1 = h.getText();
		System.out.println("You have selected " + h1 + " service");

		WebElement i = driver.findElement(By.xpath("//label[text()='Covishield']"));
		a1.executeScript("arguments[0].click();", i);

		String i1 = i.getText();

		WebElement j = driver.findElement(By.xpath("//label[text()='Covaxin']"));
		a1.executeScript("arguments[0].click();", j);
		String j1 = j.getText();

		System.out.println("slected vaccines are: ");
		System.out.println(i1);
		System.out.println(j1);
		System.out.println();

		/*
		 * WebElement k = driver.findElement(By.
		 * xpath("(//p[contains(text(),'Srinivas Priya Hospita')])[3]")); String l =
		 * k.getText(); System.out.println(l);
		 */
		List<WebElement> n = driver.findElements(By.tagName("p"));
		
		System.out.println(n);
		
		  int o1 = 0, o2 = 0;
		  
		  for (WebElement o : n) {
		  
		  if (o.getText().contains("Chennai") == true) {
		  
		  if (o.getText().contains("Tamil Nadu") == true) {
		  
		  System.out.println(o.getText()); System.out.println(); o1++; 
		  
		  }
		  else{
		  
		  System.out.println("Not in Tamil Nadu " + o.getText()); o2++; }
		  
		  }
		  // else System.err.println("Not in Chennai " + o.getText());
		  
		  } System.out.println("Number of hospitals for covid-19 vaccination in chennai is " + o1);
		  System.out.println();
		 		//System.out.println("Number of hospitals for covid-19 vaccination out of  chennai is " + o2);
	}

}
