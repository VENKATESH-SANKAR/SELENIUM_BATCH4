package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragAndDrop {

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
		//driver.get("https://linkedin.com");
		//driver.manage().window().maximize();
		 String url = "https://jqueryui.com/droppable/";
	     driver.get(url);
		
	     
	  // Switch to the iframe containing the drag and drop elements
         driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
         Thread.sleep(4000);
      // Find the source element (the element to be dragged)
         WebElement sourceElement = driver.findElement(By.id("draggable"));
         
      // Find the target element (the element to drop onto)
         WebElement targetElement = driver.findElement(By.id("droppable"));
         
      // Create an Actions object to perform the drag and drop action
         Actions actions = new Actions(driver);
         
         // METHOD --- 1
       //  actions.dragAndDrop(sourceElement, targetElement).perform();
         
         // METHOD ---- 2
         actions.clickAndHold(sourceElement)
         .moveToElement (targetElement)
 	    .release (targetElement)
         
         .build()
  	     .perform();
	}

}
