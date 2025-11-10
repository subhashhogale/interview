package Selenium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class testautomationpractice {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=chromeinvok.setup();
	//	datepicker(driver);
	//	datepicker1(driver);
	//	webTable(driver);
		
		DynamanicwebTable(driver);
	}

	public static void datepicker(WebDriver driver) throws InterruptedException {
		driver.get("https://testautomationpractice.blogspot.com/?utm_source=chatgpt.com");
		
		WebElement home = driver.findElement(By.xpath("//a[@class='home-link']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(home).build().perform();
		
		Thread.sleep(3000);
		WebElement dateInput = driver.findElement(By.id("datepicker"));
	    dateInput.click();
	    Thread.sleep(1000);
		String expMonth = "March";
		String expYear = "1989";
		String expDay = "17";
		
		while (true) {
		   
		    String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		    String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		    
		    if (month.equals(expMonth) && year.equals(expYear)) {
		    	break;
		    }
		    driver.findElement(By.xpath("//span[text()='Prev']")).click();
		 //   driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
		}
		driver.findElement(By.xpath("//a[text()='"+expDay+"']")).click();
	}
	
	public static void datepicker1(WebDriver driver) throws InterruptedException {
driver.get("https://testautomationpractice.blogspot.com/?utm_source=chatgpt.com");
		
		WebElement home = driver.findElement(By.xpath("//a[@class='home-link']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(home).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Start Date']")).sendKeys("17-03-1989");
	}
	
	public static void webTable(WebDriver driver) throws InterruptedException {
driver.get("https://testautomationpractice.blogspot.com/?utm_source=chatgpt.com");
		
		WebElement DynamicWebTable = driver.findElement(By.xpath("//h2[contains(text(),'Dynamic Web Table')]"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(DynamicWebTable).build().perform();
		
		Thread.sleep(3000);
	int total=0;
		List<WebElement> price = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[4]"));
		
		for (WebElement p : price) {
			String price1 = p.getText();
			System.out.println(price1);
			int v = Integer.parseInt(price1);
			
			
			total+=v;
		}
		
		System.out.println(total);
	}
	
	public static void DynamanicwebTable(WebDriver driver) throws InterruptedException {
		driver.get("https://testautomationpractice.blogspot.com/?utm_source=chatgpt.com");
				
				WebElement DynamicWebTable = driver.findElement(By.xpath("//h2[contains(text(),'Dynamic Web Table')]"));			
				Actions ac=new Actions(driver);				
				ac.moveToElement(DynamicWebTable).build().perform();
				
				Thread.sleep(3000);
		
				// Get headers
				List<WebElement> headers = driver.findElements(By.xpath("//table[@id='taskTable']//th"));

				// Create a map for Column Name -> Index
				Map<String, Integer> colIndex = new HashMap<>();

//				for (int i = 0; i < headers.size(); i++) {
//				    colIndex.put(headers.get(i).getText(), i);
//				}
				
				int i=0;
				for (WebElement e : headers) {
					colIndex.put(e.getText(), i);
					
					i++;
				}
			
				List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']//tr"));	
				for (WebElement r : rows) {
					
					List<WebElement> alltd = r.findElements(By.tagName("td"));
					
					if(alltd.size()>0) {
						String name = alltd.get(colIndex.get("Name")).getText();
						String Network = alltd.get(colIndex.get("Network (Mbps)")).getText();
						String Memory = alltd.get(colIndex.get("Memory (MB)")).getText();
						String CPU = alltd.get(colIndex.get("CPU (%)")).getText();
						String Disk  = alltd.get(colIndex.get("Disk (MB/s)")).getText();
						
						switch (name) {
						case "Chrome":
							
							System.out.println("CPU load of Chrome process:"+CPU);
							System.out.println("Network speed of Chrome process"+Network);
							break;
						case "Firefox":
							System.out.println("Memory Size of Firefox process:"+Memory);
							System.out.println("Disk space of Firefox process:"+Disk);
							break;
						default:
							break;
						}
	
					}
		
				}
	
	}
}
