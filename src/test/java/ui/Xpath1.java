package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://safehealth.me/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement element=	driver.findElement(By.xpath("//section[@id='joinnow']//child::div/div[@class='elementor-row']/div/div/div/div[3]/div/div/a/span/span"));
	Actions action = new Actions(driver);
	
	action.moveToElement(element).perform();
	
	element.click();
		//driver.close();

	}

}
