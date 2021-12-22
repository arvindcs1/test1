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

public class All_links_onwebpage {
	public static void verifyLinkActive(String linkUrl) {
		try {
			
			// Step1 .//Rule 1 URL Class to pass the link
			URL url = new URL(linkUrl);
			
			// Step 2: HttpURLConnection To check the response of the url
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			
			//Step 3: Time WAIt 
			httpURLConnect.setConnectTimeout(3000);
			
			//Step 4:Establishing connection
			
			httpURLConnect.connect();
			
			//checking response 
			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl+"----"+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl+"----"+httpURLConnect.getResponseMessage());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
	//printing the total number of links
		System.out.println("Total number of links are: "+links.size());
		
		for(int i=0;i<links.size();i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
		}

	}

}
