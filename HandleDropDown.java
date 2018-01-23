import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilu\\IntroSelenium\\Week06\\Ex\\osTicketWorkSpace\\NaveenAutonationJava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// launch url
		driver.get("https://www.facebook.com/");
		//handling month dropdown
		Select select = new Select(	driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText("Mar");
		
		//handling date dropdown
		Select select1 = new Select(driver.findElement(By.id("day")));	
		select1.selectByValue("18");
		
		//handling year dropdown
		Select select2 = new Select(driver.findElement(By.id("year")));	
		select2.selectByValue("1995");
		
		//print all the values of dropdown year
		List<WebElement> yearList = driver.findElements(By.xpath("//select[@id='year']//option"));
		System.out.println(yearList.size());
		//iterating and printing all the values
		for(int i=0;i<yearList.size();i++) {
			System.out.println(yearList.get(i).getText());
			if(yearList.get(i).getText().equals("1962")) {
				yearList.get(i).click();
				break;
			}
			
		}
		
		
	}

}
