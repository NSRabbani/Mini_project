package com.projects;

import java.io.File; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class miniProject5 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.airasia.co.in/home");

		driver.findElement(By.id("One Way")).click();

		Thread.sleep(2000);

		WebElement a = driver.findElement(By.xpath("(//div[@class='flight-search-source-field-read-only'])[1]"));

		a.click();

		driver.findElement(By.id("basic-url")).sendKeys("chennai");
		Thread.sleep(2000);
		driver.findElement(By.id("list-item")).click();

		/*
		 * WebElement b = driver.findElement(By.xpath(
		 * "(//div[@class='flight-search-source-field-read-only'])[2]")); b.click();
		 */
		driver.findElement(By.id("basic-url")).sendKeys("delhi");
		Thread.sleep(2000);

		driver.findElement(By.id("list-item")).click();

		driver.findElement(By.className("flight-search-date-picker-wrapper")).click();

		Thread.sleep(2000);

		Thread.sleep(2000);
		WebElement da = driver.findElement(By.xpath("(//div[text()='31'])[2]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", da);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", da);

		// js.executeScript("arguments[0].scrollintoview();",da);

//		js.executeScript("arguments[0].scrollintoview();", da);

		driver.findElement(By.xpath("//button[text()='Back']")).click();

		driver.findElement(By.xpath("//div[text()='Special Fares']")).click();

		WebElement add = driver.findElement(By.xpath("(//img[@id='adult'])[2]"));

		for (int i = 0; i < 2; i++) {
			add.click();
		}
		WebElement a0 = driver.findElement(By.xpath("//div[text()='Fri, Dec 31']"));
		String a0a = a0.getText();

		WebElement ad = driver.findElement(By.xpath("(//img[@id='scp'])[2]"));
		ad.click();

		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\air.png");
		FileUtils.copyFile(s, d);

		driver.findElement(By.className("flight-search-icon")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.name("onestop")).click();

		WebElement a1 = driver.findElement(By.id("depAfterSix"));
		js.executeScript("arguments[0].click();", a1);

		WebElement a2 = driver.findElement(By.xpath("//div[@data-testid='source-field']"));
		String a2a = a2.getText();
		System.out.println(a2a);

		WebElement a3 = driver.findElement(By.xpath("//div[@data-testid='destination-field']"));
		String a3a = a3.getText();
		System.out.println(a3a);

		String a4 = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[144]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div"))
				.getText();
		System.out.println(a4);
		System.out.println("............................................");

		if (a4.contains("MAA") && a4.contains("DEL") && a4.contains(a0a)) {
			System.out.println("Flights filtered as per selected place and date successfully ");
			System.out.println("............................................");
		}
		List<WebElement> price = driver.findElements(By.xpath("//label[@class='discounted-price']"));
		// System.out.println(price);
		List<Integer> li = new ArrayList<Integer>();
		List<String> li1 = new ArrayList<String>();
		int size = price.size();
		System.out.println(size);
		for (WebElement webel : price) {
			li1.add(webel.getText());
			String o = webel.getText().replace(",", "").substring(1);
			int p = Integer.parseInt(o);
			// System.out.println(p);
			li.add(p);

		}
		System.out.println(li1);
		// System.out.println("before sorting"+li);
		// System.out.println("............................................");
		Collections.sort(li);
		// System.out.println("after sorting"+li);
		System.out.println("............................................");
		Integer x = li.get(size - 1);

		String z = String.valueOf(x);
		String q = z.substring(0, 1) + "," + z.substring(1);

		System.out.println("highest price is:  " + q);

		WebElement lest = driver.findElement(By.xpath("(//label[contains(text(),'" + q + "')])[2]"));
		String text = lest.getText();
		System.out.println(text);

		int lest1 = li1.indexOf(text) + 1;
		System.out.println(lest1);

		// WebElement radio =
		// driver.findElement(By.xpath("(//input[@type='radio'])['"+lest1+"']"));
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[" + lest1 + "]"));
		js.executeScript("arguments[0].click();", radio);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='continue-btn']")).click();

//		driver.switchTo().alert().accept();
		Thread.sleep(4000);

		TakesScreenshot t1 = (TakesScreenshot) driver;
		File s1 = t.getScreenshotAs(OutputType.FILE);
		File d1 = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\aira.png");
		FileUtils.copyFile(s1, d1);

	}
}
