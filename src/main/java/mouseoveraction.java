import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveraction
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 driver=new ChromeDriver();
		driver.get("http://mrbool.com/course/");
		//WebElement contentlink=driver.findElement(By.xpath("//a[@class='menulink']"));
		//Actions ac=new Actions(driver);
		//ac.moveToElement(contentlink).perform();
		//driver.findElement(By.linkText("COURSES")).click();
		By mainmenu=By.xpath("//a[@class='menulink']");
		By submenu=By.linkText("COURSES");
				selectsubmenu(mainmenu,submenu);
	}
public static WebElement getElement(By locator)
{
	return driver.findElement(locator);
}
public static void selectsubmenu(By parentmenu,By submenu) throws InterruptedException
{
	WebElement parent=getElement(parentmenu);
	Actions ac=new Actions(driver);
	ac.moveToElement(parent).perform();
	Thread.sleep(2000);
	getElement(submenu).click();
	
}
public static void selectsubmenulevel2(By main,By sub1,By sub2) throws InterruptedException
{
	Actions ac=new Actions(driver);
	ac.moveToElement(getElement(main)).perform();
	Thread.sleep(2000);
	ac.moveToElement(getElement(sub1)).perform();
	getElement(sub2).click();
	
}
}
