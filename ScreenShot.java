package org.selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File.*;
import java.io.IOException;
import java.time.Duration;


public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\3-AUTOMATION TESTING\\CHROME DRIVE\\1 - 14-11-2023\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//implicitywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 // Navigate to the webpage you want to capture
		driver.get("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");
		
       
            // Cast WebDriver to TakesScreenshot
            //Step 1:
        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

            // Capture the screenshot as a file
        //Step 2 (print screen) JVM
            File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
          //Step 3 - Path setup 
            // Specify the location to save the screenshot (change the path as needed)
            String screenshotPath = "G:\\3-AUTOMATION TESTING\\CHROME DRIVE\\Screenshot1.png";

            // Move the file to the desired location
            //Step 4 - Move to my path
            FileUtils.moveFile(screenshotFile, new File(screenshotPath));

           System.out.println("Screenshot saved to: " + screenshotPath);
            
	}

}
