package Dataprovider_external;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginfb {

	public static void loginfb_1()
{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arvindcs1996@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Arvindcs1615");
		
		
		
		}
}
