package ui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/automate/capabilities");
		driver.manage().window().maximize();
		
		//Initiating javascriptexecutor 
		WebElement element = driver.findElement(By.xpath("//ul[@id='navigation-tabs']"));  
		JavascriptExecutor jsexc = (JavascriptExecutor)driver;
		//scrolling into view 
		jsexc.executeScript("arguments[0].scrollIntoView(true)",element);
		
		WebElement element_1 = driver.findElement(By.xpath("//a[@id='doc-os-trigger']/span[@class='browser-list-down-caret']"));
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.visibilityOf(element_1));
	  //selecting OS
	  element_1.click();
	  
	  //Windows 10
	  driver.findElement(By.xpath("//div[@class='doc-os-desktop']/div[2]/ul[1]/li[3]")).click();
	  
	  //Device Selection 
	WebElement element_2=  driver.findElement(By.xpath("//a[@id='doc-browser-trigger']/span"));
	 wait.until(ExpectedConditions.visibilityOf(element_2));
	 element_2.click();
	 
	 //Selecting browser
	 
	 WebElement element_3= driver.findElement(By.xpath("//div[@class='doc-browser doc-browser-Chrome']/div[2]/ul[1]/li[1]/a/span"));
	 wait.until(ExpectedConditions.visibilityOf(element_3)).click();
//	 element_3.click();
	}

}
