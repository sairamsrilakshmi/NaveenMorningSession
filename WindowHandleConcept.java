import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilu\\IntroSelenium\\Week06\\Ex\\osTicketWorkSpace\\NaveenMorningSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		//click the window popup
		driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
		
		////get the window handles
		Set<String> windowhandles = driver.getWindowHandles();
		//get the iterator
		Iterator<String> it = windowhandles.iterator();
		//get the parent window string
		String parentwindow = it.next();
		System.out.println("parent window id is:" + parentwindow);
		//get the child window string
		
		String childwindow = it.next();
		
		//switch to child window
		driver.switchTo().window(childwindow);
		System.out.println("child window is:" + childwindow);

		System.out.println("child window title is :" + driver.getTitle());
		
      //close child window
		driver.close();
		//switch control to parent window
		driver.switchTo().window(parentwindow);

	}

}
