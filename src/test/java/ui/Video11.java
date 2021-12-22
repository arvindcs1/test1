package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		int location_x = element.getLocation().getX();
		System.out.println(location_x);
		int location_y = element.getLocation().getY();
		System.out.println(location_y);
	}

}
