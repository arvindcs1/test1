package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Table {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
        List<WebElement> row_daata = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        int row_siize = row_daata.size();
        System.out.println("Number of rows :"+row_siize);
        
        List<WebElement> col_daata = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        int col_siize = col_daata.size();
        System.out.println("Number of rows :"+col_siize);
        
        for(int i=1;i<=row_siize;i++)
        {
        	for(int j=1;j<=col_siize;j++) {
        		WebElement element = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/+tr["+ i+"]/td["+j+"]/a"));
        		String st =element.getText();
        		Thread.sleep(1000);
        		System.out.print(st+" ");
        	}
        	System.out.println();
        }
       
        
	}

}
