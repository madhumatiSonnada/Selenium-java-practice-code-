import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bigbasketmenusubmenu {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		By main=By.xpath("//a[@class='dropdown-toggle meganav-shop']");
		By sub1=By.linkText("Beverages");
		By sub2=By.linkText("Tea");
		By Sub3=By.linkText("Green Tea");
		
		selectsubmenulevel3(main,sub1,sub2,Sub3);
		
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void selectsubmenulevel3(By main,By sub1,By sub2,By sub3) throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(getElement(main)).perform();
		Thread.sleep(2000);
		ac.moveToElement(getElement(sub1)).perform();
		Thread.sleep(2000);
		ac.moveToElement(getElement(sub2)).perform();
		Thread.sleep(2000);
		getElement(sub3).click();
		
	}

}
