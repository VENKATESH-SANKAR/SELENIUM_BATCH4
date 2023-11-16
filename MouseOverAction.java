package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\3-AUTOMATION TESTING\\CHROME DRIVE\\1 - 14-11-2023\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://linkedin.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement joinNow = driver.findElement(By.xpath("/html/body/nav/div/a[1]"));
		
		Actions clickjoinNow = new Actions(driver);
		
		clickjoinNow.moveToElement(joinNow)
		.click()
		.build()
		.perform();
		
		WebElement emailId = driver.findElement(By.name("email-or-phone"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement agree = driver.findElement(By.xpath("//button[@id='join-form-submit']"));
		Actions linkedin = new Actions(driver);
		Action seriesOfActions = linkedin
				
		.moveToElement(emailId)
		.click()
		.keyDown(emailId, Keys.SHIFT)
		.sendKeys(emailId, "venkatesh200@gmail.com")
		
		.moveToElement(password)
		.click()
		.keyDown(password, Keys.SHIFT)
		.sendKeys(password, "HappyLife")
		
		.moveToElement(agree)
		.click()
		
		.build();
		seriesOfActions.perform();
		
	}

}
