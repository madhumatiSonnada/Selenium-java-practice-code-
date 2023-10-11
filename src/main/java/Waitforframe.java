import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforframe 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/");
		By framelocator=By.name("main");
		waitForFrameByLocator(framelocator,5);
		//waitForFrameIndex(3,10);
		String header=driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		
		
		

	}
	public static WebDriver waitForFrameByLocator(By framelocator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}
	
	public static WebDriver waitForFrameIndex(int index,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	
	public static WebDriver waitForFrameByString(String frame,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
	}
	public static WebDriver waitForByelement(WebElement frameelement,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameelement));
	}

}
