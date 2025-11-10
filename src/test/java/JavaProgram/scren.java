package JavaProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class scren {
	
	public static String captureScreenshot(WebDriver driver) throws IOException
	{
				File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File des=new File("./target/subhash.png");
				 FileHandler.copy(sc, des);
				 
				 System.out.println(" Screenshot saved successfully");
				return des.getAbsolutePath();
				
	}

}
