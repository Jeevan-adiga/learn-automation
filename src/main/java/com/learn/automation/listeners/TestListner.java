package com.learn.automation.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getTestContext().getCurrentXmlTest().getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success!!!!! " + result.getTestContext().getCurrentXmlTest().getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getTestContext().getCurrentXmlTest().getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
