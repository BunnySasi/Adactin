package org.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Rep {

	public static void main(String[] args) throws IOException {
		
		ExtentReports extentReports = new ExtentReports();
		File fs = new File(System.getProperty("user.dir")+"//reports//ReportOne.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fs);
		ExtentTest one = extentReports.createTest("TestOne");
		one.assignAuthor("Kakara Sasikiran");
		one.assignCategory("Testing");
		one.assignDevice("Desktop");
		one.log(Status.PASS,"Hello");
		one.createNode("Hellos");
		System.out.println(System.getProperty("user.dir"));
		one.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\img\\sasi\\one.jpeg");
		one.createNode("Ones!!","Hello,World!!!");
		one.fail("Error");
		extentReports.attachReporter(sparkReporter);
		extentReports.flush();
		Desktop.getDesktop().browse(fs.toURI());
	}
}
