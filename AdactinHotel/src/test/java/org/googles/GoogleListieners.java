package org.googles;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class GoogleListieners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String str = result.getName();
		System.out.println("OnTestStart: "+str);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String str = result.getName();
		System.out.println("onTestSuccess: "+str);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String str = result.getName();
		System.out.println("onTestFailure: "+str);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String str = result.getName();
		System.out.println("onTestSkippped");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		String str = context.getName();
		System.out.println("onStart: "+str);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		String str = context.getName();
		System.out.println("onFinish: "+str);
	}

	
}
