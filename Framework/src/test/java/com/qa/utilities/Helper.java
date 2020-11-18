package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public static String captureScreenshot(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String screenshotPath = System.getProperty("user.dir") + "/Screenshot/guru99" + getCurrentDateTime() + ".png";

		try {
			FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot captured");
		} catch (IOException e) {
			System.out.println("unable to capture screenshot " + e.getMessage());
		}
		return screenshotPath;
	}

	public static String getCurrentDateTime() {
		DateFormat Customeformat = new SimpleDateFormat("_dd_MM_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return Customeformat.format(currentDate);
	}

}
