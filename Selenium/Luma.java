package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Luma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\3-AUTOMATION TESTING\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("VENKATESH");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("SANKAR");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("venkatesh2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567890@Teddy");
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("1234567890@Teddy");
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();	*/
	
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("venkatesh2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567890@Teddy");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		
		//implicitywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Explicit
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/a")));
		
		//Fluentwait
		FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10));

	}

}
