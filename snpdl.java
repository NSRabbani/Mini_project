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

public class snpdl {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions A = new Actions(driver);
		driver.get("https://www.snapdeal.com/");

		Thread.sleep(2000);

		WebElement a = driver.findElement(By.xpath("(//span[@class='catText'])[3]"));
		A.moveToElement(a);
		Thread.sleep(6000);

		WebElement b = driver.findElement(By.xpath("//span[text()='Semi Automatic']"));
		A.moveToElement(b).build().perform();

		A.click().build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@title='TVs, Audio/Video & Gaming']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='sub-cat-name '])[4]")).click();
		Thread.sleep(4000);

		WebElement p1 = driver.findElement(By.xpath(
				"(//p[@title='Zebronics ZEB-S990 2.0 Multimedia Speakers for Laptop, Desktop, Mobiles & TV AV'])"));

		driver.findElement(By.xpath("(((//p[@title='Zebronics ZEB-S990 2.0 Multimedia Speakers for Laptop, Desktop, Mobiles & TV AV'])"
				+ "//parent::a//parent::div//parent::div//preceding-sibling::div)[2]//child::div)[2]")).click();

		Thread.sleep(3000);
		TakesScreenshot t = (TakesScreenshot) driver;
		File sc = t.getScreenshotAs(OutputType.FILE);
		File de = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\snpdl.png");
		FileUtils.copyFile(sc, de);

		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();

		js.executeScript("arguments[0].click();", p1);

		String w1 = driver.getWindowHandle();
		Set<String> l1 = driver.getWindowHandles();

		for (String s : l1) {

			if (!s.contains(w1)) {
				driver.switchTo().window(s);
			}
		}

		driver.findElement(By.xpath("//span[text()='add to cart']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();

		String w2 = driver.getWindowHandle();

		for (String s : l1) {

			if (s.contains(w1)) {
				driver.switchTo().window(s);
			}
		}

		Thread.sleep(3000);
		WebElement hb = driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-menu'])"));

		A.moveToElement(hb).build().perform();

		WebElement mens = driver.findElement(By.xpath("(//span[contains(text(),\"Men's Fashion\")])[2]"));

		A.moveToElement(mens).perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Jackets']")).click();

		driver.findElement(By.xpath("//label[@for='Color_s-Blue']")).click();

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,750)", "");

		WebElement qv = driver.findElement(By.xpath("(//p[@title='Hangup Blue Solid Formal 2 Piece Suits'])[2]"));

		Thread.sleep(2000);

		// js.executeScript("arguments[0].scrollIntoView(true);", qv);

		qv.click();

		Set<String> l2 = driver.getWindowHandles();

		for (String s : l2) {

			if (!s.contains(w1)) {
				if (!s.contains(w2)) {

					driver.switchTo().window(s);
				}
			}
		}
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[text()='40']")).click();

		driver.findElement(By.id("pincode-check")).sendKeys("602001");

		driver.findElement(By.id("pincode-check-bttn")).click();

		WebElement v = driver.findElement(By.className("itm-avail"));

		String vt = v.getText();

		if (vt.contains("available ")) {
			System.out.println("Product available");
		}

		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.className("cartTextSpan")).click();
		
		Thread.sleep(3000);
		File sc1 = t.getScreenshotAs(OutputType.FILE);
		File de1 = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\snpdl1.png");
		FileUtils.copyFile(sc1, de1);

	}
}
