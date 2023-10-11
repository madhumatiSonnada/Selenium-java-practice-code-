import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class Pagination 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		int pagecount=1;
		while(true)
		{
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0)
			{
				//selectcountry("Ruia");
				selectcountry1("India");
				System.out.println("pagefound" +pagecount);
				break;
			}
			else
			{
				WebElement next=driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled"))
				{
					System.out.println("Pagination is over");
					break;
				}
				next.click();
				Thread.sleep(2000);
				
				pagecount++;
				
			}
		}
			
}
	public static void selectcountry(String countryname)
	{
		driver.findElement(By.xpath("//td[text()='"+countryname+"']//preceding-sibling::td/child::input[@type='checkbox']"))
		.click();
	}
	
	//Using relative locator
	public static void selectcountry1(String contname)
	{
	WebElement el=	driver.findElement(By.xpath("//td[text()='"+contname+"']"));
	driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(el)).click();
	}

}
