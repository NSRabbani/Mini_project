package com.projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class miniProject {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Web title:" + title);

		WebElement si = driver.findElement(By.className("login"));
		si.click();

		Thread.sleep(10000);

		WebElement em = driver.findElement(By.name("email_create"));
		String entrem = em.getText();
		System.out.println(entrem);
		em.sendKeys("srsns@gmail.com");

		WebElement crt = driver.findElement(By.id("SubmitCreate"));
		crt.click();

		Thread.sleep(10000);

		WebElement val = driver.findElement(By.xpath("//h3[contains(text(),'personal ')]"));
		String s = val.getText();
		System.out.println(s);

		String s1 = "YOUR PERSONAL INFORMATION";

		if (s.equalsIgnoreCase(s1)) {
			System.out.println("Account creation page is opened succesfully");
		} else {
			System.out.println("recheck the page");

		}
		System.out.println();
		WebElement titl = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		System.out.println("Before click:  " + titl.isSelected());
		titl.click();
		System.out.println("After click:  " + titl.isSelected());

		String m = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/div/div/label"))
				.getText();

		WebElement fnt = driver.findElement(By.xpath("//label[(@for='customer_firstname')]"));
		String fnttext = fnt.getText();

		WebElement fn = driver.findElement(By.xpath("(//input[contains(@class,'validate ')])[1]"));
		fn.sendKeys("rabbani");

		String edfn = fn.getAttribute("value");
		System.out.println(fnttext);
		System.out.println(edfn);

		WebElement lnt = driver.findElement(By.xpath("//label[(@for='customer_lastname')]"));
		String lnttext = lnt.getText();

		WebElement ln = driver.findElement(By.xpath("(//input[contains(@class,'validate ')])[2]"));
		ln.sendKeys("sherif");

		String edln = ln.getAttribute("value");
		System.out.println(lnttext);
		System.out.println(edln);
		System.out.println(m + edfn + edln);

		String eml = driver.findElement(By.xpath("//label[(@for='email')]")).getText();

		System.out.println(eml);
		WebElement entrem1 = driver.findElement(By.id("email"));
		System.out.println(entrem1.getAttribute("value"));

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@333bbbA");

		String dob = driver.findElement(By.xpath("//label[text()='Date of Birth']")).getText();
		System.out.println(dob);

		WebElement dy = driver.findElement(By.id("days"));

		Select x = new Select(dy);
		boolean multiple = x.isMultiple();

		System.out.println("Is Multiple:" + multiple);
		x.selectByIndex(2);

		System.out.println(x.getFirstSelectedOption().getText());

		WebElement mo = driver.findElement(By.name("months"));
		Select y = new Select(mo);
		System.out.println("Is Multiple:" + y.isMultiple());

		y.selectByValue("3");

		System.out.println(y.getFirstSelectedOption().getText());

		WebElement yr = driver.findElement(By.name("years"));
		Select z = new Select(yr);
		System.out.println("Is Multiple:" + z.isMultiple());
		z.selectByVisibleText("1997  ");

		System.out.println(z.getFirstSelectedOption().getText());

		WebElement com = driver.findElement(By.id("company"));
		com.sendKeys("SpaceX");
		System.out.println("company:" + com.getAttribute("value"));

		WebElement add = driver.findElement(By.id("address1"));
		add.sendKeys("No:11,aaa st,TRL");
		System.out.println("Address:" + add.getAttribute("value"));

		WebElement cty = driver.findElement(By.id("city"));
		cty.sendKeys("Chennai");
		System.out.println(cty.getAttribute("value"));

		WebElement st = driver.findElement(By.name("id_state"));
		Select l = new Select(st);
		l.selectByValue("11");
		WebElement r = l.getFirstSelectedOption();
		System.out.println(r.getText());

		WebElement pc = driver.findElement(By.name("postcode"));
		pc.sendKeys("34523");
		System.out.println(pc.getAttribute("value"));

		Thread.sleep(3000);

		WebElement con = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select co = new Select(con);
		co.selectByValue("21");

		WebElement element = co.getFirstSelectedOption();
		System.out.println(element.getText());

		WebElement mob = driver.findElement(By.name("phone_mobile"));
		mob.sendKeys("1234567890");
		System.out.println(mob.getAttribute("value"));

		driver.findElement(By.id("alias")).sendKeys("web");

		WebElement sub = driver.findElement(By.name("submitAccount"));

		System.out.println("Register button enabed:" + sub.isEnabled());

		// sub.click();

	}
}
