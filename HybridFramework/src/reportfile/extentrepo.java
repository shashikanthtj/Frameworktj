package reportfile;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentrepo {
@Test
public void report()
{
	ExtentReports rep=new ExtentReports("./reports/r.html", false);
	ExtentTest test = rep.startTest("testcase1");
	test.log(LogStatus.PASS,"tc passed");
	test.log(LogStatus.FAIL,"tc failed");
	rep.endTest(test);
	rep.flush();
}
}
