package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeinvok {
	
	public static WebDriver setup() {
		WebDriver driver=new ChromeDriver();
		
		//;
		driver.manage().window().maximize();
		
		System.out.println("subhash");
		return driver;

		
	}

}
