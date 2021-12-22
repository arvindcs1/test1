package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='margin-0-top-lg margin-0-bottom-lg text-left']/div[1]/div/a/span")).click();

		Set<String> window_addr=driver.getWindowHandles();
		Iterator<String> iterator=	window_addr.iterator();
		
		String parent_window=iterator.next();
		String child_window=iterator.next();
		
		driver.switchTo().window(child_window);
		Thread.sleep(3000);
		driver.switchTo().window(parent_window);
	}

}
