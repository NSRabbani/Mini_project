package com.projects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class miniPoject3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);

		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("srs@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("@333bbbA");

		Thread.sleep(2000);

		driver.findElement(By.id("SubmitLogin")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Women']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'your favorites dresses')]")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Browse our different')]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='View']")).click();

		Thread.sleep(2500);
		WebElement qty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		for (int i = 0; i <= 3; i++) {
			Thread.sleep(2000);
			qty.click();
		}
		Thread.sleep(2000);
		WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
		Select a = new Select(size);

		a.selectByValue("2");

		driver.findElement(By.name("Pink")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='exclusive']")).click();

		Thread.sleep(3000);

		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\mini2.png");
		FileUtils.copyFile(s, d);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();

		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();

		WebElement msg = driver.findElement(By.name("message"));
		msg.sendKeys("Mini Project 2nd Half");
		System.out.println(msg.getAttribute("value"));

		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();

		driver.findElement(By.xpath("//a[@class='bankwire']")).click();

		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();

		Thread.sleep(3000);

		TakesScreenshot t2 = (TakesScreenshot) driver;
		File s2 = t.getScreenshotAs(OutputType.FILE);
		File d2 = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\mini2a.png");
		FileUtils.copyFile(s2, d2);

	}
}