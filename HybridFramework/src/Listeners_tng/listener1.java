package Listeners_tng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("exec start");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc passed");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc faild");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc skipped");
	}

}