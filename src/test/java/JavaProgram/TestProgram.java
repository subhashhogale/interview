package JavaProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestProgram {

	static WebDriver driver;

	@BeforeMethod(enabled=false)
	public void browserSetup() {

		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(dataProvider="readdata")
	public void excelSheet(String user , String pass) throws InterruptedException {
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(user);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		Thread.sleep(3000);
	}
	
	@DataProvider
	public Object[][] readdata() throws IOException {
		FileInputStream fl=new FileInputStream("./src/test/java/JavaProgram/loginnaukari.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(fl);
		
		XSSFSheet sheet = wk.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int clms = sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rows-1][clms];    //[2][2]
		
		for(int i= 1;i<rows;i++)
        {
			for(int j= 0;j<clms;j++)
			{
				DataFormatter df = new DataFormatter();
				data[i-1][j]=df.formatCellValue(sheet.getRow(i).getCell(j));	    //hogalesubhash2    						
			}	
        }
		return data;
	}
	
	@AfterMethod
	public void tearDown() {

	//driver.quit();
	}

	@Test(enabled =false)
	public void BrokenLink() throws IOException
	{
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links :"+links.size());
		
		int Broken=0;
		int Valid=0;
		for(WebElement k : links)
		{
			String url = k.getAttribute("href");
			
			try 
			{
				URL p = new URL(url);
		 HttpsURLConnection connection = (HttpsURLConnection)p.openConnection();
		 connection.connect();
		 
		 if(connection.getResponseCode()>=400)
		 {
			 System.out.println(p+"------------->"+"Broken"+"............."+connection.getResponseMessage());
			 Broken++;
		 }
		 else
		 {
			 System.out.println(p+"------------->"+connection.getResponseMessage());
			 Valid++;
		 }
			} 
			catch (MalformedURLException e)
			{
			
			}
		}
		System.out.println("Broken :"+Broken);
		System.out.println("Valid :"+Valid);
	}

	@Test
	public void Autosuggestion()
	{
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		for (WebElement e : list) {
			
			String actual = e.getText();
			System.out.println(actual);
			
			if(actual.equalsIgnoreCase("selenium python")) {
				e.click();
				break;
			}
		}
	}
	@Test
	public void webtable() {
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int clms = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		
		for(int i=1; i<rows; i++) {
			for(int j=1; j<=clms; j++) {
				
				String actual = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				
				if(actual.equalsIgnoreCase("UK")) {
					System.out.println("i:"+i+"  j:"+j);
				}
			}
		}
	}
	@Test
	public void dropDown() {
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement days = driver.findElement(By.id("day"));
		Select sl=new Select(days);
		List<WebElement> lists = sl.getOptions();
		for (WebElement e : lists) {
			System.out.println(e.getText());
		}
		
		int actual = lists.size();
		
		sl.selectByIndex(actual-3);
		}
	
	@Parameters("browser")
	@Test
	public void crossBrowse(String browser1)  
	{ 
		switch (browser1.toUpperCase()) {
		case "CHROME":
			driver=new ChromeDriver();
			
			break;
		case "FIRE":
			driver=new FirefoxDriver();
			
			break;
		default:
			break;
		}
		
	}
}
