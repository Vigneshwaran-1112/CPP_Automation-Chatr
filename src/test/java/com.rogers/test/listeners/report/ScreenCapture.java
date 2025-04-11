package com.rogers.test.listeners.report;

import extentreport.ExtentManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class contains methods related to the Screen capture utilities like screenshot images, screencast videos
 * @author rajesh.varalli1
 *
 */
public class ScreenCapture {

	/**
	 * Takes the screenshot and saves it to a file in 'png' format
	 * @param driver web driver
	 * @return the path of the screenshot as String
	 */
	public static String getScreenShot(WebDriver driver) {
      	String screenShotFilePath = generateScreenshotFilePath();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(ExtentManager.absolutePathToReport + screenShotFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenShotFilePath;
	}

	/**
	 * Take full page screenshot and save it to a file in 'png' format
	 * @param driver web driver
	 * @return the path of the screenshot as String
	 */
	public static String getFullPageScreenshot(WebDriver driver){
		String screenShotFilePath = generateScreenshotFilePath();
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(),"PNG",new File(ExtentManager.absolutePathToReport + screenShotFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenShotFilePath;
	}

	private static String generateScreenshotFilePath(){
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		String strLocalTime = ZonedDateTime.now(ZoneId.of("America/Montreal")).format(DateTimeFormatter.ofPattern("YYYY-MM-dd-HH-mm-ss"));
		return "ScreenShot_" + strLocalTime +"_"+Thread.currentThread().getId()+ ".png";
	}
}
