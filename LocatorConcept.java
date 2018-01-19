import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilu\\IntroSelenium\\Week06\\Ex\\osTicketWorkSpace\\NaveenAutonationJava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		/*
		 * //1. id WebElement email = driver.findElement(By.id("email"));
		 * email.sendKeys("test@gmail.com");
		 * driver.findElement(By.id("email")).sendKeys("test@gmail.com"); //pasword
		 * entering WebElement password = driver.findElement(By.id("pass"));
		 * password.sendKeys("test123");
		 * 
		 * //2. name WebElement name_email = driver.findElement(By.name("email"));
		 * name_email.sendKeys("test@gmail.com");
		 * 
		 * driver.findElement(By.name("pass")).sendKeys("test123");
		 * 
		 * //3.xpath driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
		 * "test@gmail.com"); driver.findElement(By.xpath("//input[@id='pass']"));
		 */

		// //4.css selector
		// driver.findElement(By.cssSelector("#email")).sendKeys("test@gmail.com");
		// driver.findElement(By.cssSelector("#pass")).sendKeys("test123");

		// .5 linktext
		// driver.findElement(By.linkText("Create a Page")).click();
		// partial link text
		// driver.findElement(By.partialLinkText("Create")).click();
		// 6. class not recommended
		// driver.findElement(By.className("inputtext _58mg _5dba
		// _2ph-")).sendKeys("rama"); //tag name
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

	}

}
