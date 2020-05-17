package rojabati.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;

	public static ExtentReports extentReportGenerator() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		//ExtentEmailReporter email = new ExtentEmailReporter("user/build/name/");

		// reporter.config().setDocumentTitle("Test Result");
		// reporter.config().setReportName("Web Automation Result");
		// reporter.config().setTheme(Theme.DARK);
		reporter.loadXMLConfig("./extent-config.xml");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Test Engineer", "Rojal Bati");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Project", "Extent Report Demo");
		//extent.attachReporter(email);
		//email.loadXMLConfig("./email-config.xml");
		// directory where output is to be printed

		return extent;
	}
}
