package com.projects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactin {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/index.php");
	
	driver.findElement(By.id("username")).sendKeys("RabbaniS");
	
	driver.findElement(By.id("password")).sendKeys("Buyadactin@1");
	
	driver.findElement(By.xpath("//input[@class='login_button']")).click();
	
	Thread.sleep(3000);
	
	WebElement s1 = driver.findElement(By.id("location"));
	Select sl1 =new Select(s1);
	sl1.selectByValue("Paris");
	
WebElement s2 = driver.findElement(By.id("hotels"));	
Select sl2=new Select(s2);
sl2.selectByValue("Hotel Hervey");

WebElement s3 = driver.findElement(By.id("room_type"));	
Select sl3=new Select(s3);
sl3.selectByValue("Super Deluxe");

WebElement s4 = driver.findElement(By.id("room_nos"));	
Select sl4=new Select(s4);
sl4.selectByValue("1");

WebElement ci = driver.findElement(By.id("datepick_in"));
ci.clear();
ci.sendKeys("31/12/2021");

WebElement co = driver.findElement(By.id("datepick_out"));
co.clear();
co.sendKeys("04/01/2022");

WebElement s5 = driver.findElement(By.id("adult_room"));	
Select sl5=new Select(s5);
sl5.selectByValue("1");

WebElement s6 = driver.findElement(By.id("child_room"));	
Select sl6=new Select(s6);
sl6.selectByValue("1");

driver.findElement(By.id("Submit")).click();

Thread.sleep(3000);

driver.findElement(By.id("radiobutton_0")).click();

driver.findElement(By.id("continue")).click();

Thread.sleep(3000);

WebElement n1 = driver.findElement(By.id("first_name"));
n1.sendKeys("Rabbani");

WebElement n2 = driver.findElement(By.id("last_name"));
n2.sendKeys("S");

driver.findElement(By.id("address")).sendKeys("No 22 1st street");

driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");

WebElement s7 = driver.findElement(By.id("cc_type"));	
Select sl7=new Select(s7);
sl7.selectByValue("MAST");

WebElement s8 = driver.findElement(By.id("cc_exp_month"));	
Select sl8=new Select(s8);
sl8.selectByValue("12");

WebElement s9 = driver.findElement(By.id("cc_exp_year"));	
Select sl9=new Select(s9);
sl9.selectByValue("2022");

driver.findElement(By.id("cc_cvv")).sendKeys("334");

Thread.sleep(3000);

driver.findElement(By.id("book_now")).click();

Thread.sleep(6000);

driver.findElement(By.id("my_itinerary")).click();

Thread.sleep(3000);

TakesScreenshot t = (TakesScreenshot) driver;
File s = t.getScreenshotAs(OutputType.FILE);
File d = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\adact.png");
FileUtils.copyFile(s, d);

driver.findElement(By.id("logout")).click();

}
}
