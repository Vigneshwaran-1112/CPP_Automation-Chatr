package com.rogers.test.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retry implements IRetryAnalyzer {

	private int count = 0;
	private static int maxTry = 0; // Run the failed test 2 times

	@Override
	public boolean retry(ITestResult iTestResult) {
		if (!iTestResult.isSuccess()) { // Check if test not succeed
			if (count < maxTry) { // Check if maxtry count is reached
				iTestResult.setStatus(ITestResult.SKIP); // Mark test as failed
				count++; // Increase the maxTry count by 1
				return true; // Tells TestNG to re-run the test
			}
		} else {
			iTestResult.setStatus(ITestResult.SUCCESS); // If test passes, TestNG marks it as passed
		}
		return false;
	}
}