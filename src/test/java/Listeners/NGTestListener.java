package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NGTestListener implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test start!");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test success!");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test fail!");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test skip!");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test percentage!");
    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("Test on start!");

    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("Test on finish!");

    }
}
