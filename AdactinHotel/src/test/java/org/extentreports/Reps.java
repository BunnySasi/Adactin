package org.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reps {

	public static void main(String[] args) throws IOException {
		// extentreport
		// extentsparkreporter

		ExtentReports extentReports = new ExtentReports();
		File fs = new File(System.getProperty("user.dir") + "//extentReportsTest//TestOne.html");
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(fs);
		ExtentTest ax = extentReports.createTest("Hello,World!!");
		ExtentTest bx = extentReports.createTest("World!! Hello");
		bx.log(Status.PASS, "Helloss");
		ax.log(Status.PASS, "Hellos!!");
		ax.log(Status.FAIL, "Fail");
		ax.log(Status.SKIP, "Skip!!!!");
		ax.assignAuthor("Sasikiran Kakara");
		ax.assignCategory("Automation Testing");
		ax.assignDevice("Desktop");
		ax.assignAuthor("Pavan");
		ax.assignCategory("Developer");
		ax.assignDevice("Mac");
		ax.createNode("Hello,Node");
		ax.addScreenCaptureFromPath(System.getProperty("user.dir") + "//Sasi//images//TestOne.jpeg");
		extentReports.attachReporter(extentSparkReporter);
		extentReports.flush();
		Desktop.getDesktop().browse(fs.toURI());

	}
}
