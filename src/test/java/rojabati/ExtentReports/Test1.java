package rojabati.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 extends base {
	WebDriver driver;

	@Parameters({ "browser", "url" })
	@Test
	public void navigateToBajraAbout(String browser, String url) {
		driver = intitalizeDriver(browser, url);
	}
}
