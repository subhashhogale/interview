package Selenium;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.math3.analysis.function.Ulp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class All extends chromeinvok {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver=chromeinvok.setup();
	//	brokenLinks(driver);
		webtable(driver);
		
	}
	
	public static void brokenLinks(WebDriver driver) throws IOException {
		driver.get("https://www.google.com/");
		
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		
		
		for (WebElement e : lists) {
			
			
			String u = e.getAttribute("href");
			
			
			URL u1=new URL(u);
			
			 HttpsURLConnection v1=	(HttpsURLConnection)u1.openConnection();
			 
			 v1.connect();
			 
			 if(v1.getResponseCode()>400) {
				 System.out.println(u1+"------>"+v1.getResponseMessage()+"  broken links");
			 }
			 else {
				 System.out.println(u1+"------>"+v1.getResponseMessage()+" not broken links");
			 }
		}	
	}
	public static void webtable(WebDriver driver) {
		
		driver.get("https://seleniumpractise.blogspot.com/");
		List<WebElement> country = driver.findElements(By.xpath("//table[@id='customers']//tr//td[4]"));
		
		for (WebElement c : country) {
			
			System.out.println(c.getText());
			
		}
		
	}
	

}
