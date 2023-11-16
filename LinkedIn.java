package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LinkedIn {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//a[@data-test-id='sign-in-join-cta']")).click();
		driver.findElement(By.xpath("//input[@name='email-or-phone']")).sendKeys("venkatesh2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("7448944566");
		driver.findElement(By.xpath("//button[@id='join-form-submit']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("VENKATESH");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("SANKAR");
		driver.findElement(By.xpath("//button[@id='join-form-submit']")).click();		
	}
	
}


