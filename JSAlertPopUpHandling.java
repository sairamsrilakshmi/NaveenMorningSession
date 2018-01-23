import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilu\\IntroSelenium\\Week06\\Ex\\osTicketWorkSpace\\NaveenAutonationJava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// launch url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// click go button
		driver.findElement(By.name("proceed")).click();
		// swith to Alert

		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("the text of alert is:" + alert.getText());

		// validation of alert text
		if (alert.getText().equals("Please enter a valid user name")) {
			System.out.println("printing correct alert message");
		} else {
			System.out.println("printing wrong alert message");
		}
		// clicking ok button on alert
		alert.accept();
	    //cancel button
		alert.dismiss();

	}

}
