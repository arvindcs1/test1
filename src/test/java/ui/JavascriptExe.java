package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		JavascriptExecutor jsexc = (JavascriptExecutor)driver;
		
		
		//Getting title of the webpage 
		String script = "return document.title;";
	    String title=(String)jsexc.executeScript(script);
		System.out.println(title);
		
		//Clicking button
		driver.switchTo().frame("iframeResult");
		jsexc.executeScript("myFunction()");
		
		driver.switchTo().alert().accept();
		
		//highlighting element with javaScript 
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("/html/body/button"));
		jsexc.executeScript("arguments[0].style.border='5px solid blue'", element);
		Thread.sleep(5000);
		//Scrolling the wepage 
		driver.navigate().to("https://www.w3schools.com/jsref/met_win_alert.asp");
		Thread.sleep(2000);
		WebElement element_2 = driver.findElement(By.xpath("//*[@id=\"main\"]/a"));
		jsexc.executeScript("arguments[0].scrollIntoView(true)", element_2);
		}

}
