package ui;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Lnks {

	public static void link_verfication(String link_url) {
		try {
			
			//URL class 
			URL url = new URL(link_url);
			//HTTP connection class
			HttpURLConnection httpu = (HttpURLConnection)url.openConnection();
			//Setting timeout to read url
			httpu.setReadTimeout(3000);
			
			//establishing connection
			httpu.connect();
			if(httpu.getResponseCode()==200) {
				System.out.println(link_url+"==="+"Good");
			}
			if(httpu.getResponseCode()==httpu.HTTP_NOT_FOUND) {
				System.out.println(link_url+"==="+"Bad");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		
		int no_of_links = all_links.size();
		
		for(int i=0;i<no_of_links;i++) {
			WebElement ele = all_links.get(i);
			String link = ele.getAttribute("href");
			link_verfication(link);
		}

	}

}
