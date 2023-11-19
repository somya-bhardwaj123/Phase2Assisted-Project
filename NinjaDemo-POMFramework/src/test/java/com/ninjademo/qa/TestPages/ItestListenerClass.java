package com.ninjademo.qa.TestPages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Method start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Method success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Method failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Method skipped");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test Method fail with timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Testing has started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Testing has finished");
	
	}

}
