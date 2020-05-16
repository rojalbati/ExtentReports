package rojabati.ExtentReports;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 extends base {
	WebDriver driver;

	@Parameters({ "browser", "url" })
	@Test
	public void navToBajraWork(String browser, String url) {
		driver = intitalizeDriver(browser, url);
		assertEquals(driver.getTitle(), "Intentionally Wrong Title To See Screenshot");
	}
}
