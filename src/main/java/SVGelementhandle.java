import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGelementhandle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(6000);
		List<WebElement> states=
driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g']//*[name()='path']"));
		System.out.println(states.size());
		
		Actions ac=new Actions(driver);
		for(WebElement e:states)
		{
			ac.moveToElement(e).perform();
			String name=e.getAttribute("name");
			System.out.println(name);
			
		}
	}

}
