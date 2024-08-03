package ReRunAutomation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunAutomationScripts implements IRetryAnalyzer {

	private int retryCnt = 0;
	private final int maxCount = 4;

	@Override
	public boolean retry(ITestResult result) {

		if (retryCnt < maxCount) {
			retryCnt++;
			return true;
		}
		return false;
	}

}
