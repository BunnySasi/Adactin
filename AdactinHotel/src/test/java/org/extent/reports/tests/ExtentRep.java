package org.extent.reports.tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRep {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports = new ExtentReports();
		File fs = new File(System.getProperty("user.dir")+"\\Extent\\Reports\\report.html");
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(fs);
		extentReports.attachReporter(extentSparkReporter);
		ExtentTest ts = extentReports.createTest("Hello");
		ts.pass("TestOne Passed!!");
		ExtentTest tq = extentReports.createTest("Hello One!!");
		tq.fail("Test Two Failed!!");
		ExtentTest tr = extentReports.createTest("Hello Two!!");
		tr.skip("Test Three Skipped!!");
		ExtentTest qw = extentReports.createTest("Hello Three!!");
		qw.info("Test Four Information");
		qw.log(Status.WARNING, "Warnings!!");
		qw.log(Status.PASS,"<b>Hello</b>");
		extentReports.flush();
		Desktop.getDesktop().browse(fs.toURI());
	}
}
