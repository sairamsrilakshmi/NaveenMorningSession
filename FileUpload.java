import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilu\\IntroSelenium\\Week06\\Ex\\osTicketWorkSpace\\NaveenAutonationJava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// launch url
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		//uploading file to Add files input
		driver.findElement(By.xpath("//input[@name='files[]']")).sendKeys("C:\\Users\\srilu\\Desktop\\Capture.PNG");
		
		

	}

}
