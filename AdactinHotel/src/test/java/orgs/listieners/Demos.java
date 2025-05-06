package orgs.listieners;

import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class Demos implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String str = result.getName();
		System.out.println(str+"onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String str = result.getName();
		System.out.println(str+"onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		String str = result.getName();
		Throwable str = result.getThrowable();
		System.out.println(str+"onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		List<ITestNGMethod> str = result.getSkipCausedBy();
		System.out.println(str+"onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		String str = result.getName();
		System.out.println(str+"onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		String str = result.getName();
		System.out.println(str+"onTestFailedWithoutTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		String str = context.getName();
		System.out.println(str+"onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		String str = context.getName();
		System.out.println(str+"onFinish");
	}

	
}
