package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		//WebElement element = ;
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		select.selectByIndex(1);
		WebElement element_multi = driver.findElement(By.id("cars"));
		Select select_multi = new Select(element_multi);
		if(select_multi.isMultiple()) {
			select_multi.selectByIndex(0);
			select_multi.selectByIndex(1);
		}
		

	}

}
