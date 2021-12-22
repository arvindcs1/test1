package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuItem {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/menu#");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//ul[@id='nav']/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement element_2 = driver.findElement(By.xpath("//ul[@id='nav']/li[2]/ul/li[3]/a"));
		action.moveToElement(element_2).click().perform();

		System.out.println("Done");
	}

}
