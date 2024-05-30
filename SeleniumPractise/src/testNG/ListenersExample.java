package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {
	
	@Override
    public void onTestStart(ITestResult result) {
        //ITestListener.super.onTestStart(result);
        System.out.println("Test Case is going to execute");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //ITestListener.super.onTestSuccess(result);
        System.out.println("Test Case is Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //ITestListener.super.onTestFailure(result);
        System.out.println("Test Case is Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //ITestListener.super.onTestSkipped(result);
        System.out.println("Test Case is Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        //ITestListener.super.onStart(context);
        System.out.println("Before Everything");
    }

    @Override
    public void onFinish(ITestContext context) {
        //ITestListener.super.onFinish(context);
        System.out.println("After Everything");
    }

}
