package com.rogers.test.listeners.report;

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

public class CaptureScreen {
    /**
     * Takes the screenshot and saves it to a file in 'png' format
     *
     * @param driver web driver
     * @return the path of the screenshot as String
     */
        public static String getScreenShot(WebDriver driver) {
            System.setProperty("org.uncommons.reportng.escape-output", "false");
            String  resultsDir= Manager.absolutePathToReport;
            String strLocalTime = ZonedDateTime.now(ZoneId.of("America/Montreal")).format(DateTimeFormatter.ofPattern("YYYY-MM-dd-HH-mm-ss"));
            String screenShotFilePath = resultsDir + "ScreenShot_" + strLocalTime +"_"+Thread.currentThread().getId()+ ".png";

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(scrFile, new File(screenShotFilePath));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return "ScreenShot_" + strLocalTime +"_"+Thread.currentThread().getId()+".png";
        }
    public static String getScreenShotwithFullPage(WebDriver driver) throws IOException {
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        String resultsDir = Manager.absolutePathToReport;
        String strLocalTime = ZonedDateTime.now(ZoneId.of("America/Montreal")).format(DateTimeFormatter.ofPattern("YYYY-MM-dd-HH-mm-ss"));
        String screenShotFilePath = resultsDir + "ScreenShot_" + strLocalTime + "_" + Thread.currentThread().getId() + ".png";
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting( 1000)).takeScreenshot(driver);
        //driver.quit();// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
              ImageIO.write(screenshot.getImage(), "PNG", new File(screenShotFilePath));
            // FileUtils.copyFile(screenshot, new File(screenShotFilePath));
        } catch
        (IOException e) {// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "ScreenShot_" + strLocalTime + "_" + Thread.currentThread().getId() +".png";
    }
}



