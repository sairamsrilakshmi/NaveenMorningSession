import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// launch Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilu\\IntroSelenium\\Week06\\Ex\\osTicketWorkSpace\\NaveenAutonationJava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// launch url
		driver.get("https://www.facebook.com/");

		// get the login page title
		String loginPageTitle = driver.getTitle();
		System.out.println("the login page title is:" + loginPageTitle);

		// asserting by if statement the tile
		if (loginPageTitle.equals("Facebook - Log In or Sign Up")) {
			System.out.println("It is the correct tile" + "....>" + loginPageTitle);

		} else {
			System.out.println("It is incorreect title");

		}
		// print current url
		String currenturl = driver.getCurrentUrl();

		// validating current url

		if (!currenturl.contains("index.html")) {
			System.out.println("The current url is not redirecting to  index.html");
		} else {
			System.out.println("The current url has index.html");
		}

		// print Pagesource

		System.out.println("The Page source is :" + driver.getPageSource());

	}

}
