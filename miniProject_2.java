package com.projects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class miniProject_2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");

		Thread.sleep(4000);

		WebElement p1 = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
		p1.click();

		Thread.sleep(2000);
		WebElement p2 = driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]"));
		p2.click();
		Thread.sleep(2000);

		WebElement p3 = driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]"));
		p3.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();

		driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]")).click();

		driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]")).click();

		driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]")).click();

		driver.findElement(By.xpath("(//a[@rel='nofollow'])[4]")).click();

		driver.findElement(By.className("wpmenucart-contents")).click();

		WebElement qt = driver.findElement(By.xpath("//input[@type='number']"));
		System.out.println("Before incmt:" + qt.getAttribute("value"));
		qt.clear();
		qt.sendKeys("6");

		System.out.println("after incmt:" + qt.getAttribute("value"));

		String s = driver.findElement(By.xpath("//a[text()='Mastering JavaScript']")).getText();
		System.out.println(s);

		driver.findElement(By.xpath("(//a[@title='Remove this item'])[3]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();

		WebElement fnt = driver.findElement(By.xpath("//label[@for=\"billing_first_name\"]"));
		System.out.println(fnt.getText());

		WebElement fn = driver.findElement(By.name("billing_first_name"));
		fn.sendKeys("rabbani");

		System.out.println(fn.getAttribute("value"));

		WebElement lnt = driver.findElement(By.xpath("//label[@for='billing_last_name']"));
		System.out.println(lnt.getText());

		WebElement ln = driver.findElement(By.id("billing_last_name"));
		ln.sendKeys("sherif");

		System.out.println(ln.getAttribute("value"));

		WebElement comt = driver.findElement(By.xpath("//label[@for='billing_company']"));
		System.out.println(comt.getText());

		WebElement com = driver.findElement(By.name("billing_company"));
		com.sendKeys("spaceX");
		System.out.println(com.getAttribute("value"));

		WebElement emt = driver.findElement(By.xpath("//label[@for='billing_email']"));
		System.out.println(emt.getText());

		WebElement em = driver.findElement(By.name("billing_email"));
		em.sendKeys("abcd@gmail.com");

		WebElement cont = driver.findElement(By.xpath("//label[@for='billing_phone']"));
		System.out.println(cont.getText());

		WebElement con = driver.findElement(By.name("billing_phone"));
		con.sendKeys("34567890");
		System.out.println(con.getAttribute("value"));

		WebElement conrt = driver.findElement(By.xpath("//label[@for='billing_country']"));
		System.out.println(conrt.getText());

		driver.findElement(By.xpath("//b[@role='presentation']")).click();

		WebElement conrts = driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));
		conrts.click();
		conrts.sendKeys("India");

		Thread.sleep(2000);

		WebElement clco = driver.findElement(By.xpath("(//div[@role='option'])[2]"));
		clco.click();

		System.out.println(conrts.getText());

		WebElement adt = driver.findElement(By.xpath("//label[text()='Address']"));
		System.out.println(adt.getText());

		WebElement addt = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		addt.sendKeys("No 34 aaa street");

		System.out.println(addt.getAttribute("value"));

		WebElement cit = driver.findElement(By.xpath("//label[@for='billing_city']"));
		System.out.println(cit.getText());

		WebElement citt = driver.findElement(By.name("billing_city"));
		citt.sendKeys("chennai");

		System.out.println(citt.getAttribute("value"));

		WebElement stt = driver.findElement(By.xpath("//label[@for='billing_state']"));
		System.out.println(stt.getText());

		driver.findElement(By.xpath("(//b[@role='presentation'])[2]")).click();

		WebElement clco1 = driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));
		clco1.sendKeys("Tamil");
		Thread.sleep(3000);

		WebElement tn = driver.findElement(By.xpath("//div[@role='option']"));
		tn.click();

		WebElement pct = driver.findElement(By.xpath("//label[@for='billing_postcode']"));
		System.out.println(pct.getText());

		WebElement pc = driver.findElement(By.name("billing_postcode"));
		pc.sendKeys("602001");

		System.out.println(pc.getAttribute("value"));

		driver.findElement(By.id("payment_method_cod")).click();

		Thread.sleep(5000);

		driver.findElement(By.id("place_order")).click();

		Thread.sleep(3000);

		TakesScreenshot re = (TakesScreenshot) driver;
		File scns = re.getScreenshotAs(OutputType.FILE);
		File yu = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\scn11.png");
		FileUtils.copyFile(scns, yu);

	}

}
